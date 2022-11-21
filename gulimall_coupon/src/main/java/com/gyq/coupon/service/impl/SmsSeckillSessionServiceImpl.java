package com.gyq.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.coupon.dao.SmsSeckillSessionDao;
import com.gyq.coupon.entity.SmsSeckillSession;
import com.gyq.coupon.service.SmsSeckillSessionService;
import org.springframework.stereotype.Service;

/**
 * 秒杀活动场次(SmsSeckillSession)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl extends ServiceImpl<SmsSeckillSessionDao, SmsSeckillSession> implements SmsSeckillSessionService {

}

