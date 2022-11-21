package com.gyq.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.member.dao.UmsMemberCollectSubjectDao;
import com.gyq.member.entity.UmsMemberCollectSubject;
import com.gyq.member.service.UmsMemberCollectSubjectService;
import org.springframework.stereotype.Service;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@Service("umsMemberCollectSubjectService")
public class UmsMemberCollectSubjectServiceImpl extends ServiceImpl<UmsMemberCollectSubjectDao, UmsMemberCollectSubject> implements UmsMemberCollectSubjectService {

}

