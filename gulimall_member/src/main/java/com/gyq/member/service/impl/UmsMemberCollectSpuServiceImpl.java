package com.gyq.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.member.dao.UmsMemberCollectSpuDao;
import com.gyq.member.entity.UmsMemberCollectSpu;
import com.gyq.member.service.UmsMemberCollectSpuService;
import org.springframework.stereotype.Service;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl extends ServiceImpl<UmsMemberCollectSpuDao, UmsMemberCollectSpu> implements UmsMemberCollectSpuService {

}

