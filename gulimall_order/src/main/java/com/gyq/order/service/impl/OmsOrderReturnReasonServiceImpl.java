package com.gyq.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.order.dao.OmsOrderReturnReasonDao;
import com.gyq.order.entity.OmsOrderReturnReason;
import com.gyq.order.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;

/**
 * 退货原因(OmsOrderReturnReason)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:51:06
 */
@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReason> implements OmsOrderReturnReasonService {

}

