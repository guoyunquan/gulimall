package com.gyq.order.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;
/**
 * 退货原因(OmsOrderReturnReason)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:51:06
 */
@SuppressWarnings("serial")
public class OmsOrderReturnReason extends Model<OmsOrderReturnReason> {
    //id
    private Long id;
    //退货原因名
    private String name;
    //排序
    private Integer sort;
    //启用状态
    private Integer status;
    //create_time
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

