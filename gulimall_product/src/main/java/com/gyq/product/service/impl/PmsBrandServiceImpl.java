package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsBrandDao;
import com.gyq.product.entity.PmsBrand;
import com.gyq.product.service.PmsBrandService;
import org.springframework.stereotype.Service;

/**
 * 品牌(PmsBrand)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsBrandService")
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandDao, PmsBrand> implements PmsBrandService {

}

