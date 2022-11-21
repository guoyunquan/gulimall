package com.gyq.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.member.dao.UmsMemberLevelDao;
import com.gyq.member.entity.UmsMemberLevel;
import com.gyq.member.service.UmsMemberLevelService;
import org.springframework.stereotype.Service;

/**
 * 会员等级(UmsMemberLevel)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl extends ServiceImpl<UmsMemberLevelDao, UmsMemberLevel> implements UmsMemberLevelService {

}

