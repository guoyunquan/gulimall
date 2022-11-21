package com.gyq.product.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.product.entity.PmsCategoryBrandRelation;
import com.gyq.product.service.PmsCategoryBrandRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 品牌分类关联(PmsCategoryBrandRelation)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@RestController
@RequestMapping("pmsCategoryBrandRelation")
public class PmsCategoryBrandRelationController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PmsCategoryBrandRelationService pmsCategoryBrandRelationService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param pmsCategoryBrandRelation 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<PmsCategoryBrandRelation> page, PmsCategoryBrandRelation pmsCategoryBrandRelation) {
        return success(this.pmsCategoryBrandRelationService.page(page, new QueryWrapper<>(pmsCategoryBrandRelation)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.pmsCategoryBrandRelationService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsCategoryBrandRelation 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody PmsCategoryBrandRelation pmsCategoryBrandRelation) {
        return success(this.pmsCategoryBrandRelationService.save(pmsCategoryBrandRelation));
    }

    /**
     * 修改数据
     *
     * @param pmsCategoryBrandRelation 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody PmsCategoryBrandRelation pmsCategoryBrandRelation) {
        return success(this.pmsCategoryBrandRelationService.updateById(pmsCategoryBrandRelation));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.pmsCategoryBrandRelationService.removeByIds(idList));
    }
}

