package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.common.PageResult;
import com.gyq.product.dao.PmsBrandDao;
import com.gyq.product.dto.PmsBrandPageDto;
import com.gyq.product.entity.PmsBrand;
import com.gyq.product.service.PmsBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌(PmsBrand)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsBrandService")
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandDao, PmsBrand> implements PmsBrandService {
    @Resource
    private PmsBrandDao pmsBrandDao;
    @Override
    public PageResult<PmsBrand> getAllList(PmsBrandPageDto pmsBrandPageDto) {
        PageResult<PmsBrand> pageResult = new PageResult<>();
        //获取总数total
        Integer total = pmsBrandDao.getTotal(pmsBrandPageDto);
        List<PmsBrand> list =  pmsBrandDao.getList(pmsBrandPageDto);
        pageResult.setList(list);
        pageResult.setTotal(total);
        pageResult.setCurrent(pmsBrandPageDto.getPage());
        pageResult.setSize(pmsBrandPageDto.getLimit());
        return pageResult;
    }
}

