package com.gyq.product.controller;




import com.baomidou.mybatisplus.extension.api.ApiController;


import com.gyq.common.R;
import com.gyq.product.entity.PmsCategory;
import com.gyq.product.service.PmsCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;

import java.util.List;

/**
 * 商品三级分类(PmsCategory)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@RestController
@RequestMapping("/pmsCategory")
public class PmsCategoryController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PmsCategoryService pmsCategoryService;

    /**
     * 查询所有数据
     * 按照树形结构分别查询出一级，二级，三级菜单所有的数据
     */
    @GetMapping("/all/tree")
    public R selectAll() {
        List<PmsCategory> categoryList = pmsCategoryService.listWithTree();
        return R.ok().put("data", categoryList);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        PmsCategory category = pmsCategoryService.getById(id);
        return R.ok().put("data", category);
    }

    /**
     * 新增数据
     *
     * @param pmsCategory 实体对象
     * @return 新增结果
     */
    @PostMapping("/add")
    public R insert(@RequestBody PmsCategory pmsCategory) {
        pmsCategoryService.save(pmsCategory);
        return R.ok();
    }

    /**
     * 修改数据
     *
     * @param pmsCategory 实体对象
     * @return 修改结果
     */
    @PostMapping("/update")
    public R update(@RequestBody PmsCategory pmsCategory) {
        pmsCategoryService.updateById(pmsCategory);
        return R.ok();
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @PostMapping("/delete")
    public R delete(@RequestBody List<Long> idList) {
        pmsCategoryService.deleteMenuByIds(idList);
        return R.ok();
    }
}

