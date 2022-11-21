package com.gyq.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.order.dao.OmsOrderDao;
import com.gyq.order.entity.OmsOrder;
import com.gyq.order.service.OmsOrderService;
import org.springframework.stereotype.Service;

/**
 * 订单(OmsOrder)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:51:06
 */
@Service("omsOrderService")
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderDao, OmsOrder> implements OmsOrderService {

}

