package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsCategoryBrandRelationDao;
import com.gyq.product.entity.PmsCategoryBrandRelation;
import com.gyq.product.service.PmsCategoryBrandRelationService;
import org.springframework.stereotype.Service;

/**
 * 品牌分类关联(PmsCategoryBrandRelation)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsCategoryBrandRelationService")
public class PmsCategoryBrandRelationServiceImpl extends ServiceImpl<PmsCategoryBrandRelationDao, PmsCategoryBrandRelation> implements PmsCategoryBrandRelationService {

}

