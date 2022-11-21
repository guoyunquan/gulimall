package com.gyq.coupon.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.coupon.entity.SmsHomeSubject;
import com.gyq.coupon.service.SmsHomeSubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@RestController
@RequestMapping("smsHomeSubject")
public class SmsHomeSubjectController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsHomeSubjectService smsHomeSubjectService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsHomeSubject 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsHomeSubject> page, SmsHomeSubject smsHomeSubject) {
        return success(this.smsHomeSubjectService.page(page, new QueryWrapper<>(smsHomeSubject)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsHomeSubjectService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubject 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsHomeSubject smsHomeSubject) {
        return success(this.smsHomeSubjectService.save(smsHomeSubject));
    }

    /**
     * 修改数据
     *
     * @param smsHomeSubject 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsHomeSubject smsHomeSubject) {
        return success(this.smsHomeSubjectService.updateById(smsHomeSubject));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsHomeSubjectService.removeByIds(idList));
    }
}

