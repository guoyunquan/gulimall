package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsSeckillSkuNoticeDao;
import com.gyq.coupon.entity.SmsSeckillSkuNotice;
import com.gyq.coupon.service.SmsSeckillSkuNoticeService;
import org.springframework.stereotype.Service;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl extends ServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNotice> implements SmsSeckillSkuNoticeService {

}

