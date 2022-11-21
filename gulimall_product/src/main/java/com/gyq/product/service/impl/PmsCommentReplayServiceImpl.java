package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsCommentReplayDao;
import com.gyq.product.entity.PmsCommentReplay;
import com.gyq.product.service.PmsCommentReplayService;
import org.springframework.stereotype.Service;

/**
 * 商品评价回复关系(PmsCommentReplay)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsCommentReplayService")
public class PmsCommentReplayServiceImpl extends ServiceImpl<PmsCommentReplayDao, PmsCommentReplay> implements PmsCommentReplayService {

}

