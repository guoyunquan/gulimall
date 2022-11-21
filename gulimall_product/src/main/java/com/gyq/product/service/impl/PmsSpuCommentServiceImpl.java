package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsSpuCommentDao;
import com.gyq.product.entity.PmsSpuComment;
import com.gyq.product.service.PmsSpuCommentService;
import org.springframework.stereotype.Service;

/**
 * 商品评价(PmsSpuComment)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsSpuCommentService")
public class PmsSpuCommentServiceImpl extends ServiceImpl<PmsSpuCommentDao, PmsSpuComment> implements PmsSpuCommentService {

}

