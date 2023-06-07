package com.gyq.product.controller;




import com.baomidou.mybatisplus.extension.api.ApiController;


import com.gyq.common.PageResult;
import com.gyq.common.R;
import com.gyq.product.dto.PmsBrandPageDto;
import com.gyq.product.entity.PmsBrand;
import com.gyq.product.service.PmsBrandService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

/**
 * 品牌(PmsBrand)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@RestController
@RequestMapping("/pmsBrand")
public class PmsBrandController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PmsBrandService pmsBrandService;

    /**
     * 分页查询所有数据
     * @param pmsBrandPageDto 分页查询所有数据入参
     * @return 所有数据
     */
    @PostMapping("/brand/list")
    public R selectAll(@RequestBody PmsBrandPageDto pmsBrandPageDto) {
        PageResult<PmsBrand> list = pmsBrandService.getAllList(pmsBrandPageDto);
        return R.ok().put("data",list);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/brand/info")
    public R selectOne(@RequestParam("id") Serializable id) {
        PmsBrand pmsBrand = pmsBrandService.getById(id);
        return R.ok().put("data",pmsBrand);
    }

    /**
     * 新增数据
     *
     * @param pmsBrand 实体对象
     * @return 新增结果
     */
    @PostMapping("/brand/save")
    public R insert(@Valid @RequestBody  PmsBrand pmsBrand) {
        pmsBrandService.save(pmsBrand);
        return R.ok();
    }

    /**
     * 修改数据
     *
     * @param pmsBrand 实体对象
     * @return 修改结果
     */
    @PostMapping("/brand/update")
    public R update(@RequestBody PmsBrand pmsBrand) {
        pmsBrandService.updateById(pmsBrand);
        return R.ok();
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @PostMapping("/brand/delete")
    public R delete(@RequestBody List<Long> idList) {
        pmsBrandService.removeByIds(idList);
        return R.ok();
    }
}

