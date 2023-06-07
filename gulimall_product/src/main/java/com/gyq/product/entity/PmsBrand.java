package com.gyq.product.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gyq.common.valid.ListValue;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌(PmsBrand)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@SuppressWarnings("serial")
public class PmsBrand extends Model<PmsBrand> {
    //品牌id
    @TableId
    @JsonSerialize
    private Long brandId;
    //品牌名
    @NotBlank(message = "品牌名不能为空")
    private String name;
    //品牌logo地址
    @NotBlank(message = "logo图片路径不能为空")
    @URL
    private String logo;
    //介绍
    private String descript;
    //显示状态[0-不显示；1-显示]
    @ListValue(value = {0,1})
    @NotNull(message = "显示状态不能为空")
    private Integer showStatus;
    //检索首字母
    @Pattern(regexp = "^[a-zA-Z]+$", message = "首字母需要a-z或者A-Z，并且不能为空")
    private String firstLetter;
    //排序
    @Min(0)
    @Max(20)
    @NotNull(message = "排序不能为空")
    private Integer sort;


    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.brandId;
    }

    @Override
    public String toString() {
        return "PmsBrand{" +
                "brandId=" + brandId +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", descript='" + descript + '\'' +
                ", showStatus=" + showStatus +
                ", firstLetter='" + firstLetter + '\'' +
                ", sort=" + sort +
                '}';
    }
}

