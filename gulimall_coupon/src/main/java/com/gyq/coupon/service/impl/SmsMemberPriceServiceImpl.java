package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsMemberPriceDao;
import com.gyq.coupon.entity.SmsMemberPrice;
import com.gyq.coupon.service.SmsMemberPriceService;
import org.springframework.stereotype.Service;

/**
 * 商品会员价格(SmsMemberPrice)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl extends ServiceImpl<SmsMemberPriceDao, SmsMemberPrice> implements SmsMemberPriceService {

}

