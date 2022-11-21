package com.gyq.product.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 品牌分类关联(PmsCategoryBrandRelation)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@SuppressWarnings("serial")
public class PmsCategoryBrandRelation extends Model<PmsCategoryBrandRelation> {
    
    private Long id;
    //品牌id
    private Long brandId;
    //分类id
    private Long catelogId;
    
    private String brandName;
    
    private String catelogName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCatelogName() {
        return catelogName;
    }

    public void setCatelogName(String catelogName) {
        this.catelogName = catelogName;
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

