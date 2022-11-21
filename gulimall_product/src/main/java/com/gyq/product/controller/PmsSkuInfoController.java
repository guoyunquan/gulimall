package com.gyq.product.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.product.entity.PmsSkuInfo;
import com.gyq.product.service.PmsSkuInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * sku信息(PmsSkuInfo)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@RestController
@RequestMapping("pmsSkuInfo")
public class PmsSkuInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSkuInfoService pmsSkuInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param pmsSkuInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<PmsSkuInfo> page, PmsSkuInfo pmsSkuInfo) {
        return success(this.pmsSkuInfoService.page(page, new QueryWrapper<>(pmsSkuInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.pmsSkuInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsSkuInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody PmsSkuInfo pmsSkuInfo) {
        return success(this.pmsSkuInfoService.save(pmsSkuInfo));
    }

    /**
     * 修改数据
     *
     * @param pmsSkuInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody PmsSkuInfo pmsSkuInfo) {
        return success(this.pmsSkuInfoService.updateById(pmsSkuInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.pmsSkuInfoService.removeByIds(idList));
    }
}

