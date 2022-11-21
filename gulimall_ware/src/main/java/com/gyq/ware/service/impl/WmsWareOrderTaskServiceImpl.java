package com.gyq.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.ware.dao.WmsWareOrderTaskDao;
import com.gyq.ware.entity.WmsWareOrderTask;
import com.gyq.ware.service.WmsWareOrderTaskService;
import org.springframework.stereotype.Service;

/**
 * 库存工作单(WmsWareOrderTask)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:54:47
 */
@Service("wmsWareOrderTaskService")
public class WmsWareOrderTaskServiceImpl extends ServiceImpl<WmsWareOrderTaskDao, WmsWareOrderTask> implements WmsWareOrderTaskService {

}

