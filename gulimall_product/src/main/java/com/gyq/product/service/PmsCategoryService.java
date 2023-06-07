package com.gyq.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gyq.product.entity.PmsCategory;

import java.util.List;

/**
 * 商品三级分类(PmsCategory)表服务接口
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
public interface PmsCategoryService extends IService<PmsCategory> {

    List<PmsCategory> listWithTree();

    boolean deleteMenuByIds(List<Long> idList);
}

