package com.gyq.product.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * sku图片(PmsSkuImages)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@SuppressWarnings("serial")
public class PmsSkuImages extends Model<PmsSkuImages> {
    //id
    private Long id;
    //sku_id
    private Long skuId;
    //图片地址
    private String imgUrl;
    //排序
    private Integer imgSort;
    //默认图[0 - 不是默认图，1 - 是默认图]
    private Integer defaultImg;


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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getImgSort() {
        return imgSort;
    }

    public void setImgSort(Integer imgSort) {
        this.imgSort = imgSort;
    }

    public Integer getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(Integer defaultImg) {
        this.defaultImg = defaultImg;
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

