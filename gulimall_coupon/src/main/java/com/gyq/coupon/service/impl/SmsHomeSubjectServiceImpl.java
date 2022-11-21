package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsHomeSubjectDao;
import com.gyq.coupon.entity.SmsHomeSubject;
import com.gyq.coupon.service.SmsHomeSubjectService;
import org.springframework.stereotype.Service;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsHomeSubjectService")
public class SmsHomeSubjectServiceImpl extends ServiceImpl<SmsHomeSubjectDao, SmsHomeSubject> implements SmsHomeSubjectService {

}

