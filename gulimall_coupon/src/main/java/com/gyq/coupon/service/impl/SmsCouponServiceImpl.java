package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsCouponDao;
import com.gyq.coupon.entity.SmsCoupon;
import com.gyq.coupon.service.SmsCouponService;
import org.springframework.stereotype.Service;

/**
 * 优惠券信息(SmsCoupon)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsCouponService")
public class SmsCouponServiceImpl extends ServiceImpl<SmsCouponDao, SmsCoupon> implements SmsCouponService {

}

