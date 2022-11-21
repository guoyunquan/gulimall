package com.gyq.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.order.dao.OmsPaymentInfoDao;
import com.gyq.order.entity.OmsPaymentInfo;
import com.gyq.order.service.OmsPaymentInfoService;
import org.springframework.stereotype.Service;

/**
 * 支付信息表(OmsPaymentInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:51:06
 */
@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl extends ServiceImpl<OmsPaymentInfoDao, OmsPaymentInfo> implements OmsPaymentInfoService {

}

