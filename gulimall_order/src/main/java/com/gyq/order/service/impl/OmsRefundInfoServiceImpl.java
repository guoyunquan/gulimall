package com.gyq.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.order.dao.OmsRefundInfoDao;
import com.gyq.order.entity.OmsRefundInfo;
import com.gyq.order.service.OmsRefundInfoService;
import org.springframework.stereotype.Service;

/**
 * 退款信息(OmsRefundInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:51:06
 */
@Service("omsRefundInfoService")
public class OmsRefundInfoServiceImpl extends ServiceImpl<OmsRefundInfoDao, OmsRefundInfo> implements OmsRefundInfoService {

}

