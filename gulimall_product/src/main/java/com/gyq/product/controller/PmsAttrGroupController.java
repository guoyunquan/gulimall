package com.gyq.product.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.product.entity.PmsAttrGroup;
import com.gyq.product.service.PmsAttrGroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 属性分组(PmsAttrGroup)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@RestController
@RequestMapping("pmsAttrGroup")
public class PmsAttrGroupController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PmsAttrGroupService pmsAttrGroupService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param pmsAttrGroup 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<PmsAttrGroup> page, PmsAttrGroup pmsAttrGroup) {
        return success(this.pmsAttrGroupService.page(page, new QueryWrapper<>(pmsAttrGroup)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.pmsAttrGroupService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsAttrGroup 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody PmsAttrGroup pmsAttrGroup) {
        return success(this.pmsAttrGroupService.save(pmsAttrGroup));
    }

    /**
     * 修改数据
     *
     * @param pmsAttrGroup 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody PmsAttrGroup pmsAttrGroup) {
        return success(this.pmsAttrGroupService.updateById(pmsAttrGroup));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.pmsAttrGroupService.removeByIds(idList));
    }
}

