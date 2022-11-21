package com.gyq.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.ware.dao.UndoLogDao;
import com.gyq.ware.entity.UndoLog;
import com.gyq.ware.service.UndoLogService;
import org.springframework.stereotype.Service;

/**
 * (UndoLog)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:54:47
 */
@Service("undoLogService")
public class UndoLogServiceImpl extends ServiceImpl<UndoLogDao, UndoLog> implements UndoLogService {

}

