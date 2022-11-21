package com.gyq.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.ware.dao.WmsPurchaseDao;
import com.gyq.ware.entity.WmsPurchase;
import com.gyq.ware.service.WmsPurchaseService;
import org.springframework.stereotype.Service;

/**
 * 采购信息(WmsPurchase)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:54:47
 */
@Service("wmsPurchaseService")
public class WmsPurchaseServiceImpl extends ServiceImpl<WmsPurchaseDao, WmsPurchase> implements WmsPurchaseService {

}

