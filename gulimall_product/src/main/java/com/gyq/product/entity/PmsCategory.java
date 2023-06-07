package com.gyq.product.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品三级分类(PmsCategory)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:52:04
 */
@SuppressWarnings("serial")
@Data
public class PmsCategory extends Model<PmsCategory> {
    //分类id
    @TableId(value = "cat_id")
    private Long catId;
    //分类名称
    private String name;
    //父分类id
    private Long parentCid;
    //层级
    private Integer catLevel;
    //是否显示[0-不显示，1显示]
    @TableLogic
    private Integer showStatus;
    //排序
    private Integer sort;
    //图标地址
    private String icon;
    //计量单位
    private String productUnit;
    //商品数量
    private Integer productCount;

    //子分类
    @TableField(exist = false)
    private List<PmsCategory> children;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.catId;
    }
    }

