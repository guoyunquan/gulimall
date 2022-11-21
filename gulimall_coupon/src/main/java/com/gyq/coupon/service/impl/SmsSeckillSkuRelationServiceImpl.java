package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsSeckillSkuRelationDao;
import com.gyq.coupon.entity.SmsSeckillSkuRelation;
import com.gyq.coupon.service.SmsSeckillSkuRelationService;
import org.springframework.stereotype.Service;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsSeckillSkuRelationService")
public class SmsSeckillSkuRelationServiceImpl extends ServiceImpl<SmsSeckillSkuRelationDao, SmsSeckillSkuRelation> implements SmsSeckillSkuRelationService {

}

