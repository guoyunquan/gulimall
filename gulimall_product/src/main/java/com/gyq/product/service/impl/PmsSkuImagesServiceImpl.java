package com.gyq.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.product.dao.PmsSkuImagesDao;
import com.gyq.product.entity.PmsSkuImages;
import com.gyq.product.service.PmsSkuImagesService;
import org.springframework.stereotype.Service;

/**
 * sku图片(PmsSkuImages)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@Service("pmsSkuImagesService")
public class PmsSkuImagesServiceImpl extends ServiceImpl<PmsSkuImagesDao, PmsSkuImages> implements PmsSkuImagesService {

}

