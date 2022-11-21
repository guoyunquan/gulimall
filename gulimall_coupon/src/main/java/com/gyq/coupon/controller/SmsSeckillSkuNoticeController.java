package com.gyq.coupon.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.coupon.entity.SmsSeckillSkuNotice;
import com.gyq.coupon.service.SmsSeckillSkuNoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@RestController
@RequestMapping("smsSeckillSkuNotice")
public class SmsSeckillSkuNoticeController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillSkuNoticeService smsSeckillSkuNoticeService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsSeckillSkuNotice 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsSeckillSkuNotice> page, SmsSeckillSkuNotice smsSeckillSkuNotice) {
        return success(this.smsSeckillSkuNoticeService.page(page, new QueryWrapper<>(smsSeckillSkuNotice)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsSeckillSkuNoticeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSkuNotice 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsSeckillSkuNotice smsSeckillSkuNotice) {
        return success(this.smsSeckillSkuNoticeService.save(smsSeckillSkuNotice));
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSkuNotice 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsSeckillSkuNotice smsSeckillSkuNotice) {
        return success(this.smsSeckillSkuNoticeService.updateById(smsSeckillSkuNotice));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsSeckillSkuNoticeService.removeByIds(idList));
    }
}

