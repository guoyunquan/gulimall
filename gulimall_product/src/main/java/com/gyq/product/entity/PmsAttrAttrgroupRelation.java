package com.gyq.product.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@SuppressWarnings("serial")
public class PmsAttrAttrgroupRelation extends Model<PmsAttrAttrgroupRelation> {
    //id
    private Long id;
    //属性id
    private Long attrId;
    //属性分组id
    private Long attrGroupId;
    //属性组内排序
    private Integer attrSort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
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

