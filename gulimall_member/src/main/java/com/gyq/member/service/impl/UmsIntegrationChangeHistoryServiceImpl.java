package com.gyq.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.member.dao.UmsIntegrationChangeHistoryDao;
import com.gyq.member.entity.UmsIntegrationChangeHistory;
import com.gyq.member.service.UmsIntegrationChangeHistoryService;
import org.springframework.stereotype.Service;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@Service("umsIntegrationChangeHistoryService")
public class UmsIntegrationChangeHistoryServiceImpl extends ServiceImpl<UmsIntegrationChangeHistoryDao, UmsIntegrationChangeHistory> implements UmsIntegrationChangeHistoryService {

}

