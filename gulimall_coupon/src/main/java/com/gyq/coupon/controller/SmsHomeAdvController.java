package com.gyq.coupon.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.coupon.entity.SmsHomeAdv;
import com.gyq.coupon.service.SmsHomeAdvService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 首页轮播广告(SmsHomeAdv)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@RestController
@RequestMapping("smsHomeAdv")
public class SmsHomeAdvController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsHomeAdvService smsHomeAdvService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsHomeAdv 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsHomeAdv> page, SmsHomeAdv smsHomeAdv) {
        return success(this.smsHomeAdvService.page(page, new QueryWrapper<>(smsHomeAdv)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsHomeAdvService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsHomeAdv 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsHomeAdv smsHomeAdv) {
        return success(this.smsHomeAdvService.save(smsHomeAdv));
    }

    /**
     * 修改数据
     *
     * @param smsHomeAdv 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsHomeAdv smsHomeAdv) {
        return success(this.smsHomeAdvService.updateById(smsHomeAdv));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsHomeAdvService.removeByIds(idList));
    }
}

