package com.gyq.product.utils;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;

import java.util.List;

/**
 * 树形转换工具类
 *
 * @author : 未见清海
 * @date : 2022/7/6
 */
public class TreeUtil {

    /**
     * 把列表数据转为树形列表
     *
     * @param list       列表数据
     * @param idField    id字段
     * @param pidField   pid字段
     * @param childField 子元素字段
     * @param clazz      转换类
     * @param <T>        泛型
     * @return 树形结构
     */
    public static <T> List<T> listToTree(List list, String idField, String pidField, String childField, Class<T> clazz) {
        JSONArray arr = JSONArray.parseArray(JSON.toJSONString(list));

        JSONArray r = new JSONArray();
        JSONObject hash = new JSONObject();
        //将数组转为Object的形式，key为数组中的id
        for (Object o : arr) {
            JSONObject json = (JSONObject) o;
            hash.put(json.getString(idField), json);
        }
        //遍历结果集
        for (Object o : arr) {
            //单条记录
            JSONObject aVal = (JSONObject) o;
            //在hash中取出key为单条记录中pid的值
            JSONObject hashVp = (JSONObject) hash.get(aVal.get(pidField).toString());
            //如果记录的pid存在，则说明它有父节点，将她添加到孩子节点的集合中
            if (hashVp != null) {
                //检查是否有child属性
                if (hashVp.get(childField) != null) {
                    JSONArray ch = (JSONArray) hashVp.get(childField);
                    ch.add(aVal);
                    hashVp.put(childField, ch);
                } else {
                    JSONArray ch = new JSONArray();
                    ch.add(aVal);
                    hashVp.put(childField, ch);
                }
            } else {
                r.add(aVal);
            }
        }
        return r.toJavaList(clazz);
    }
}
