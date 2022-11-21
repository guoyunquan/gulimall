package com.gyq.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.member.dao.UmsMemberLoginLogDao;
import com.gyq.member.entity.UmsMemberLoginLog;
import com.gyq.member.service.UmsMemberLoginLogService;
import org.springframework.stereotype.Service;

/**
 * 会员登录记录(UmsMemberLoginLog)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogDao, UmsMemberLoginLog> implements UmsMemberLoginLogService {

}

