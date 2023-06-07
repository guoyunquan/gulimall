package com.gyq.member.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.member.entity.UmsMember;
import com.gyq.member.feign.CouponFeignService;
import com.gyq.member.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 会员(UmsMember)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@RestController
@RequestMapping("umsMember")
public class UmsMemberController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;

    @Autowired
    CouponFeignService couponFeignService;


    @RequestMapping("/coupons")
    public R Test() {
        UmsMember member = new UmsMember();
        member.setNickname("张三");
        R membercoupons = couponFeignService.membercoupons();
        HashMap<String, Object> map = new HashMap<>();
        map.put("member", member);
        map.put("coupon", membercoupons.getData());
        return R.ok(map);
    }

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param umsMember 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UmsMember> page, UmsMember umsMember) {
        return success(this.umsMemberService.page(page, new QueryWrapper<>(umsMember)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.umsMemberService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMember 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UmsMember umsMember) {
        return success(this.umsMemberService.save(umsMember));
    }

    /**
     * 修改数据
     *
     * @param umsMember 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UmsMember umsMember) {
        return success(this.umsMemberService.updateById(umsMember));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.umsMemberService.removeByIds(idList));
    }
}

