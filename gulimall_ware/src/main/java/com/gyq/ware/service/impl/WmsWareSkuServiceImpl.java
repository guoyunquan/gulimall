package com.gyq.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.ware.dao.WmsWareSkuDao;
import com.gyq.ware.entity.WmsWareSku;
import com.gyq.ware.service.WmsWareSkuService;
import org.springframework.stereotype.Service;

/**
 * 商品库存(WmsWareSku)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:54:47
 */
@Service("wmsWareSkuService")
public class WmsWareSkuServiceImpl extends ServiceImpl<WmsWareSkuDao, WmsWareSku> implements WmsWareSkuService {

}

