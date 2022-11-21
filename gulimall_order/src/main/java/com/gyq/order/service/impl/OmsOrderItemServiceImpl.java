package com.gyq.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.order.dao.OmsOrderItemDao;
import com.gyq.order.entity.OmsOrderItem;
import com.gyq.order.service.OmsOrderItemService;
import org.springframework.stereotype.Service;

/**
 * 订单项信息(OmsOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:51:06
 */
@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemDao, OmsOrderItem> implements OmsOrderItemService {

}

