package com.gyq.product.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * spu信息介绍(PmsSpuInfoDesc)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@SuppressWarnings("serial")
public class PmsSpuInfoDesc extends Model<PmsSpuInfoDesc> {
    //商品id
    private Long spuId;
    //商品介绍
    private String decript;


    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.spuId;
    }
    }

