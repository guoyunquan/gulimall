package com.gyq.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.member.dao.UmsMemberStatisticsInfoDao;
import com.gyq.member.entity.UmsMemberStatisticsInfo;
import com.gyq.member.service.UmsMemberStatisticsInfoService;
import org.springframework.stereotype.Service;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@Service("umsMemberStatisticsInfoService")
public class UmsMemberStatisticsInfoServiceImpl extends ServiceImpl<UmsMemberStatisticsInfoDao, UmsMemberStatisticsInfo> implements UmsMemberStatisticsInfoService {

}

