package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsCategoryDao;
import com.gyq.product.entity.PmsCategory;
import com.gyq.product.service.PmsCategoryService;
import com.gyq.product.utils.TreeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品三级分类(PmsCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategory> implements PmsCategoryService {
    @Autowired
    private PmsCategoryDao pmsCategoryDao;
    @Override
    public List<PmsCategory> listWithTree() {
        List<PmsCategory> categoryList = pmsCategoryDao.selectList(null);

        List<PmsCategory> categoryList1 = TreeUtil.listToTree(categoryList, "catId", "parentCid", "children", PmsCategory.class);
        return categoryList1;
    }

    @Override
    public boolean deleteMenuByIds(List<Long> idList) {
        //TODO 添加逻辑判断 确定什么情况要删除
        int i = pmsCategoryDao.deleteBatchIds(idList);
        return i==0?false:true;
    }
}

