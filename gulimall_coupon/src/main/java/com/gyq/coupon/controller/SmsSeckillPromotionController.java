package com.gyq.coupon.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.coupon.entity.SmsSeckillPromotion;
import com.gyq.coupon.service.SmsSeckillPromotionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 秒杀活动(SmsSeckillPromotion)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@RestController
@RequestMapping("smsSeckillPromotion")
public class SmsSeckillPromotionController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillPromotionService smsSeckillPromotionService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsSeckillPromotion 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsSeckillPromotion> page, SmsSeckillPromotion smsSeckillPromotion) {
        return success(this.smsSeckillPromotionService.page(page, new QueryWrapper<>(smsSeckillPromotion)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsSeckillPromotionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSeckillPromotion 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsSeckillPromotion smsSeckillPromotion) {
        return success(this.smsSeckillPromotionService.save(smsSeckillPromotion));
    }

    /**
     * 修改数据
     *
     * @param smsSeckillPromotion 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsSeckillPromotion smsSeckillPromotion) {
        return success(this.smsSeckillPromotionService.updateById(smsSeckillPromotion));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsSeckillPromotionService.removeByIds(idList));
    }
}

