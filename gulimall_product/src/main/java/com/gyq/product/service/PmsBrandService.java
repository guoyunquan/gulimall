package com.gyq.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gyq.common.PageResult;
import com.gyq.product.dto.PmsBrandPageDto;
import com.gyq.product.entity.PmsBrand;

import java.util.List;

/**
 * 品牌(PmsBrand)表服务接口
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
public interface PmsBrandService extends IService<PmsBrand> {
    PageResult<PmsBrand> getAllList(PmsBrandPageDto pmsBrandPageDto);


}

