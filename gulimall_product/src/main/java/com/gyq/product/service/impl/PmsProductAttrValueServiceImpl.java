package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsProductAttrValueDao;
import com.gyq.product.entity.PmsProductAttrValue;
import com.gyq.product.service.PmsProductAttrValueService;
import org.springframework.stereotype.Service;

/**
 * spu属性值(PmsProductAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsProductAttrValueService")
public class PmsProductAttrValueServiceImpl extends ServiceImpl<PmsProductAttrValueDao, PmsProductAttrValue> implements PmsProductAttrValueService {

}

