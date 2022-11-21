package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsCategoryDao;
import com.gyq.product.entity.PmsCategory;
import com.gyq.product.service.PmsCategoryService;
import org.springframework.stereotype.Service;

/**
 * 商品三级分类(PmsCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategory> implements PmsCategoryService {

}

