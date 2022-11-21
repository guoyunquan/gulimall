package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsCouponHistoryDao;
import com.gyq.coupon.entity.SmsCouponHistory;
import com.gyq.coupon.service.SmsCouponHistoryService;
import org.springframework.stereotype.Service;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryDao, SmsCouponHistory> implements SmsCouponHistoryService {

}

