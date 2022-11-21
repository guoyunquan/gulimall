package com.gyq.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.ware.dao.WmsWareOrderTaskDetailDao;
import com.gyq.ware.entity.WmsWareOrderTaskDetail;
import com.gyq.ware.service.WmsWareOrderTaskDetailService;
import org.springframework.stereotype.Service;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:54:47
 */
@Service("wmsWareOrderTaskDetailService")
public class WmsWareOrderTaskDetailServiceImpl extends ServiceImpl<WmsWareOrderTaskDetailDao, WmsWareOrderTaskDetail> implements WmsWareOrderTaskDetailService {

}

