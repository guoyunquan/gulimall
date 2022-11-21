package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsSpuInfoDescDao;
import com.gyq.product.entity.PmsSpuInfoDesc;
import com.gyq.product.service.PmsSpuInfoDescService;
import org.springframework.stereotype.Service;

/**
 * spu信息介绍(PmsSpuInfoDesc)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsSpuInfoDescService")
public class PmsSpuInfoDescServiceImpl extends ServiceImpl<PmsSpuInfoDescDao, PmsSpuInfoDesc> implements PmsSpuInfoDescService {

}

