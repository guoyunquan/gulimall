package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsAttrDao;
import com.gyq.product.entity.PmsAttr;
import com.gyq.product.service.PmsAttrService;
import org.springframework.stereotype.Service;

/**
 * 商品属性(PmsAttr)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsAttrService")
public class PmsAttrServiceImpl extends ServiceImpl<PmsAttrDao, PmsAttr> implements PmsAttrService {

}

