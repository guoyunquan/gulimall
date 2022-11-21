package com.gyq.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.ware.dao.WmsWareInfoDao;
import com.gyq.ware.entity.WmsWareInfo;
import com.gyq.ware.service.WmsWareInfoService;
import org.springframework.stereotype.Service;

/**
 * 仓库信息(WmsWareInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:54:47
 */
@Service("wmsWareInfoService")
public class WmsWareInfoServiceImpl extends ServiceImpl<WmsWareInfoDao, WmsWareInfo> implements WmsWareInfoService {

}

