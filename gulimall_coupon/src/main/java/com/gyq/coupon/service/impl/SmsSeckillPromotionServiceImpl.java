package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsSeckillPromotionDao;
import com.gyq.coupon.entity.SmsSeckillPromotion;
import com.gyq.coupon.service.SmsSeckillPromotionService;
import org.springframework.stereotype.Service;

/**
 * 秒杀活动(SmsSeckillPromotion)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsSeckillPromotionService")
public class SmsSeckillPromotionServiceImpl extends ServiceImpl<SmsSeckillPromotionDao, SmsSeckillPromotion> implements SmsSeckillPromotionService {

}

