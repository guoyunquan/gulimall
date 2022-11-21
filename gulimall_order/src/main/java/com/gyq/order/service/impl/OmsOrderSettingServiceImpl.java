package com.gyq.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.order.dao.OmsOrderSettingDao;
import com.gyq.order.entity.OmsOrderSetting;
import com.gyq.order.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;

/**
 * 订单配置信息(OmsOrderSetting)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:51:06
 */
@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingDao, OmsOrderSetting> implements OmsOrderSettingService {

}

