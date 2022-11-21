package com.gyq.ware.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gyq.ware.entity.UndoLog;
import com.gyq.ware.service.UndoLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (UndoLog)表控制层
 *
 * @author makejava
 * @since 2022-11-14 22:54:47
 */
@RestController
@RequestMapping("undoLog")
public class UndoLogController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UndoLogService undoLogService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param undoLog 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UndoLog> page, UndoLog undoLog) {
        return success(this.undoLogService.page(page, new QueryWrapper<>(undoLog)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.undoLogService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param undoLog 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UndoLog undoLog) {
        return success(this.undoLogService.save(undoLog));
    }

    /**
     * 修改数据
     *
     * @param undoLog 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UndoLog undoLog) {
        return success(this.undoLogService.updateById(undoLog));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.undoLogService.removeByIds(idList));
    }
}

