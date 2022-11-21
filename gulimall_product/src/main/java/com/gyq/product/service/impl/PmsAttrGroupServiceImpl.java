package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsAttrGroupDao;
import com.gyq.product.entity.PmsAttrGroup;
import com.gyq.product.service.PmsAttrGroupService;
import org.springframework.stereotype.Service;

/**
 * 属性分组(PmsAttrGroup)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsAttrGroupService")
public class PmsAttrGroupServiceImpl extends ServiceImpl<PmsAttrGroupDao, PmsAttrGroup> implements PmsAttrGroupService {

}

