package com.gyq.product.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 属性分组(PmsAttrGroup)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@SuppressWarnings("serial")
public class PmsAttrGroup extends Model<PmsAttrGroup> {
    //分组id
    private Long attrGroupId;
    //组名
    private String attrGroupName;
    //排序
    private Integer sort;
    //描述
    private String descript;
    //组图标
    private String icon;
    //所属分类id
    private Long catelogId;


    public Long getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    public String getAttrGroupName() {
        return attrGroupName;
    }

    public void setAttrGroupName(String attrGroupName) {
        this.attrGroupName = attrGroupName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.attrGroupId;
    }
    }

