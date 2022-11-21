package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsSkuInfoDao;
import com.gyq.product.entity.PmsSkuInfo;
import com.gyq.product.service.PmsSkuInfoService;
import org.springframework.stereotype.Service;

/**
 * sku信息(PmsSkuInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsSkuInfoService")
public class PmsSkuInfoServiceImpl extends ServiceImpl<PmsSkuInfoDao, PmsSkuInfo> implements PmsSkuInfoService {

}

