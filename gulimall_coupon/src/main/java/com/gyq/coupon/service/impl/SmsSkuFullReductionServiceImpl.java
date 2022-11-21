package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsSkuFullReductionDao;
import com.gyq.coupon.entity.SmsSkuFullReduction;
import com.gyq.coupon.service.SmsSkuFullReductionService;
import org.springframework.stereotype.Service;

/**
 * 商品满减信息(SmsSkuFullReduction)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsSkuFullReductionService")
public class SmsSkuFullReductionServiceImpl extends ServiceImpl<SmsSkuFullReductionDao, SmsSkuFullReduction> implements SmsSkuFullReductionService {

}

