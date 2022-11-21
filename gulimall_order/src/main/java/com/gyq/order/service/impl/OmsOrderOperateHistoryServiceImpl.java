package com.gyq.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.order.dao.OmsOrderOperateHistoryDao;
import com.gyq.order.entity.OmsOrderOperateHistory;
import com.gyq.order.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:51:06
 */
@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryDao, OmsOrderOperateHistory> implements OmsOrderOperateHistoryService {

}

