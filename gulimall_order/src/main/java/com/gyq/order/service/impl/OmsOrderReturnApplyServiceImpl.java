package com.gyq.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.order.dao.OmsOrderReturnApplyDao;
import com.gyq.order.entity.OmsOrderReturnApply;
import com.gyq.order.service.OmsOrderReturnApplyService;
import org.springframework.stereotype.Service;

/**
 * 订单退货申请(OmsOrderReturnApply)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:51:06
 */
@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl extends ServiceImpl<OmsOrderReturnApplyDao, OmsOrderReturnApply> implements OmsOrderReturnApplyService {

}

