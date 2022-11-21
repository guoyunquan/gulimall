package com.gyq.product.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.product.entity.PmsSpuInfoDesc;
import com.gyq.product.service.PmsSpuInfoDescService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * spu信息介绍(PmsSpuInfoDesc)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@RestController
@RequestMapping("pmsSpuInfoDesc")
public class PmsSpuInfoDescController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSpuInfoDescService pmsSpuInfoDescService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param pmsSpuInfoDesc 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<PmsSpuInfoDesc> page, PmsSpuInfoDesc pmsSpuInfoDesc) {
        return success(this.pmsSpuInfoDescService.page(page, new QueryWrapper<>(pmsSpuInfoDesc)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.pmsSpuInfoDescService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsSpuInfoDesc 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody PmsSpuInfoDesc pmsSpuInfoDesc) {
        return success(this.pmsSpuInfoDescService.save(pmsSpuInfoDesc));
    }

    /**
     * 修改数据
     *
     * @param pmsSpuInfoDesc 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody PmsSpuInfoDesc pmsSpuInfoDesc) {
        return success(this.pmsSpuInfoDescService.updateById(pmsSpuInfoDesc));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.pmsSpuInfoDescService.removeByIds(idList));
    }
}

