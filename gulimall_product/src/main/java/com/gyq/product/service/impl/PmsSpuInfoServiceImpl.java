package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsSpuInfoDao;
import com.gyq.product.entity.PmsSpuInfo;
import com.gyq.product.service.PmsSpuInfoService;
import org.springframework.stereotype.Service;

/**
 * spu信息(PmsSpuInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsSpuInfoService")
public class PmsSpuInfoServiceImpl extends ServiceImpl<PmsSpuInfoDao, PmsSpuInfo> implements PmsSpuInfoService {

}

