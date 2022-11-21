package com.gyq.product.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@SuppressWarnings("serial")
public class PmsSkuSaleAttrValue extends Model<PmsSkuSaleAttrValue> {
    //id
    private Long id;
    //sku_id
    private Long skuId;
    //attr_id
    private Long attrId;
    //销售属性名
    private String attrName;
    //销售属性值
    private String attrValue;
    //顺序
    private Integer attrSort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Integer getAttrSort() {
        return attrSort;
    }

    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }

