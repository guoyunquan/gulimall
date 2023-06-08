package com.gyq.thirdParty.controller;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.SmUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.crypto.digest.Digester;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.gyq.common.util.EncryptUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author GYQ
 * @date 2023/5/18 23:46
 */
@RestController
public class OssController {
    @Resource
    public OSSClient ossClient;

    @Value("${spring.application.alicloud.oss.endpoint}")
    private String endpoint;
    @Value("${spring.application.alicloud.oss.bucket}")
    private String bucket;
    @Value("${spring.application.alicloud.access-key}")
    private String accessId;
    @Value("${salt}")
    private String salt;

    /**
     * oss生成签名 作用于上传数据到oss
     * @return
     */
    @GetMapping("/oss/policy")
    public HashMap<String, Object> getSign() {
        HashMap<String, Object> map = new HashMap<>();
        LinkedHashMap<String, String> respMap = null;

        // 填写Host地址，格式为https://bucketname.endpoint。
        String host = "https://" + bucket + "." + endpoint;
        // 设置上传回调URL，即回调服务器地址，用于处理应用服务器与OSS之间的通信。OSS会在文件上传完成后，把文件上传信息通过此回调URL发送给应用服务器。
        // String callbackUrl = "https://192.168.0.0:8888";
        // 设置上传到OSS文件的前缀，可置空此项。置空后，文件将上传至Bucket的根目录下。
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String dir = format + "/";
        try {
            long expireTime = 30;
            long expireEndTime = System.currentTimeMillis() + expireTime * 1000;
            Date expiration = new Date(expireEndTime);
            PolicyConditions policyConds = new PolicyConditions();
            policyConds.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, 1048576000);
            policyConds.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);

            String postPolicy = ossClient.generatePostPolicy(expiration, policyConds);
            byte[] binaryData = postPolicy.getBytes("utf-8");
            String encodedPolicy = BinaryUtil.toBase64String(binaryData);
            String postSignature = ossClient.calculatePostSignature(postPolicy);

            respMap = new LinkedHashMap<String, String>();
            respMap.put("accessid", EncryptUtil.decode(accessId,salt));
            respMap.put("policy", encodedPolicy);
            respMap.put("signature", postSignature);
            respMap.put("dir", dir);
            respMap.put("host", host);
            respMap.put("expire", String.valueOf(expireEndTime / 1000));
            map.put("data",respMap);
            map.put("code",200);
            map.put("message","success");


        } catch (Exception e) {
            // Assert.fail(e.getMessage());
            System.out.println(e.getMessage());
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "LTAI5tGrkd9eUVVX4KGSEzAY";
        //byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();
      //  byte[] key = SecureUtil.generateKey("AES").getEncoded();
        // 构建
        byte[] key = "ABIEeUXtP0ODaJQu".getBytes();
        AES aes = SecureUtil.aes(key);
        // 加密为16进制表示
        String encryptHex = aes.encryptHex(s);
        System.out.println(encryptHex);
        String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);
        System.out.println(decryptStr);


        //结果为：136ce3c86e4ed909b76082055a61586af20b4dab674732ebd4b599eef080c9be
        Digester digester = DigestUtil.digester("sm3");

//136ce3c86e4ed909b76082055a61586af20b4dab674732ebd4b599eef080c9be
       // String digestHex = digester.digestHex("aaaaa");

        //String digestHex = SmUtil.sm3("aaaaa");
        //System.out.println(digestHex);
     //   String digest = digester.digest(digestHex);



    }
}
