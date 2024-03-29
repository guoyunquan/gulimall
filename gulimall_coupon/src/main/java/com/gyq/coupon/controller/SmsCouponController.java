package com.gyq.coupon.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.coupon.entity.SmsCoupon;
import com.gyq.coupon.service.SmsCouponService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 优惠券信息(SmsCoupon)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@RefreshScope
@RestController
@RequestMapping("smsCoupon")
public class SmsCouponController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponService smsCouponService;
    @Value("${student.name}")
    private String stuName;
    @Value("${student.age}")
    private Integer age;

    @RequestMapping("/test")
    public R test() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", stuName);
        map.put("age", age);

        return R.ok(map);
    }


    @RequestMapping("/member/list")
    public R membercoupons() {
        SmsCoupon smsCoupon = new SmsCoupon();
        smsCoupon.setCouponName("满100减50");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(smsCoupon);
        return R.ok(objects);
    }

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param smsCoupon 查询实体
     * @return 所有数据
     */
    @GetMapping("/all")
    public R selectAll(Page<SmsCoupon> page, SmsCoupon smsCoupon) {
        return success(this.smsCouponService.page(page, new QueryWrapper<>(smsCoupon)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsCouponService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsCoupon 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsCoupon smsCoupon) {
        return success(this.smsCouponService.save(smsCoupon));
    }

    /**
     * 修改数据
     *
     * @param smsCoupon 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsCoupon smsCoupon) {
        return success(this.smsCouponService.updateById(smsCoupon));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsCouponService.removeByIds(idList));
    }
}

