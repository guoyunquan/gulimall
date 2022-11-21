package com.gyq.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyq.member.dao.UmsMemberReceiveAddressDao;
import com.gyq.member.entity.UmsMemberReceiveAddress;
import com.gyq.member.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;

/**
 * 会员收货地址(UmsMemberReceiveAddress)表服务实现类
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
@Service("umsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl extends ServiceImpl<UmsMemberReceiveAddressDao, UmsMemberReceiveAddress> implements UmsMemberReceiveAddressService {

}

