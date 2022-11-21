package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsHomeAdvDao;
import com.gyq.coupon.entity.SmsHomeAdv;
import com.gyq.coupon.service.SmsHomeAdvService;
import org.springframework.stereotype.Service;

/**
 * 首页轮播广告(SmsHomeAdv)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl extends ServiceImpl<SmsHomeAdvDao, SmsHomeAdv> implements SmsHomeAdvService {

}

