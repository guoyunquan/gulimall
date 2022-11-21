package com.gyq.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.member.dao.UmsGrowthChangeHistoryDao;
import com.gyq.member.entity.UmsGrowthChangeHistory;
import com.gyq.member.service.UmsGrowthChangeHistoryService;
import org.springframework.stereotype.Service;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@Service("umsGrowthChangeHistoryService")
public class UmsGrowthChangeHistoryServiceImpl extends ServiceImpl<UmsGrowthChangeHistoryDao, UmsGrowthChangeHistory> implements UmsGrowthChangeHistoryService {

}

