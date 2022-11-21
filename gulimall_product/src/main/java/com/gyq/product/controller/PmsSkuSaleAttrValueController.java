package com.gyq.product.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.product.entity.PmsSkuSaleAttrValue;
import com.gyq.product.service.PmsSkuSaleAttrValueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@RestController
@RequestMapping("pmsSkuSaleAttrValue")
public class PmsSkuSaleAttrValueController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSkuSaleAttrValueService pmsSkuSaleAttrValueService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param pmsSkuSaleAttrValue 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<PmsSkuSaleAttrValue> page, PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        return success(this.pmsSkuSaleAttrValueService.page(page, new QueryWrapper<>(pmsSkuSaleAttrValue)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.pmsSkuSaleAttrValueService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsSkuSaleAttrValue 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        return success(this.pmsSkuSaleAttrValueService.save(pmsSkuSaleAttrValue));
    }

    /**
     * 修改数据
     *
     * @param pmsSkuSaleAttrValue 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        return success(this.pmsSkuSaleAttrValueService.updateById(pmsSkuSaleAttrValue));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.pmsSkuSaleAttrValueService.removeByIds(idList));
    }
}

