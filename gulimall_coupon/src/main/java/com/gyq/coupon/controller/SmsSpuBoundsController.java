package com.gyq.coupon.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.coupon.entity.SmsSpuBounds;
import com.gyq.coupon.service.SmsSpuBoundsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 商品spu积分设置(SmsSpuBounds)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@RestController
@RequestMapping("smsSpuBounds")
public class SmsSpuBoundsController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSpuBoundsService smsSpuBoundsService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsSpuBounds 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsSpuBounds> page, SmsSpuBounds smsSpuBounds) {
        return success(this.smsSpuBoundsService.page(page, new QueryWrapper<>(smsSpuBounds)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsSpuBoundsService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSpuBounds 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsSpuBounds smsSpuBounds) {
        return success(this.smsSpuBoundsService.save(smsSpuBounds));
    }

    /**
     * 修改数据
     *
     * @param smsSpuBounds 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsSpuBounds smsSpuBounds) {
        return success(this.smsSpuBoundsService.updateById(smsSpuBounds));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsSpuBoundsService.removeByIds(idList));
    }
}

