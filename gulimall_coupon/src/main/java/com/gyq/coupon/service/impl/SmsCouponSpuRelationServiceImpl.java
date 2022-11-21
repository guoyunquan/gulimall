package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsCouponSpuRelationDao;
import com.gyq.coupon.entity.SmsCouponSpuRelation;
import com.gyq.coupon.service.SmsCouponSpuRelationService;
import org.springframework.stereotype.Service;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl extends ServiceImpl<SmsCouponSpuRelationDao, SmsCouponSpuRelation> implements SmsCouponSpuRelationService {

}

