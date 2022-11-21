package com.gyq.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.member.dao.UmsMemberDao;
import com.gyq.member.entity.UmsMember;
import com.gyq.member.service.UmsMemberService;
import org.springframework.stereotype.Service;

/**
 * 会员(UmsMember)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@Service("umsMemberService")
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberDao, UmsMember> implements UmsMemberService {

}

