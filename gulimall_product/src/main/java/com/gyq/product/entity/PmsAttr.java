package com.gyq.product.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 商品属性(PmsAttr)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:52:03
 */
@SuppressWarnings("serial")
public class PmsAttr extends Model<PmsAttr> {
    //属性id
    private Long attrId;
    //属性名
    private String attrName;
    //是否需要检索[0-不需要，1-需要]
    private Integer searchType;
    //属性图标
    private String icon;
    //可选值列表[用逗号分隔]
    private String valueSelect;
    //属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
    private Integer attrType;
    //启用状态[0 - 禁用，1 - 启用]
    private Long enable;
    //所属分类
    private Long catelogId;
    //快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
    private Integer showDesc;


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

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getValueSelect() {
        return valueSelect;
    }

    public void setValueSelect(String valueSelect) {
        this.valueSelect = valueSelect;
    }

    public Integer getAttrType() {
        return attrType;
    }

    public void setAttrType(Integer attrType) {
        this.attrType = attrType;
    }

    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
        this.enable = enable;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    public Integer getShowDesc() {
        return showDesc;
    }

    public void setShowDesc(Integer showDesc) {
        this.showDesc = showDesc;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.attrId;
    }
    }

