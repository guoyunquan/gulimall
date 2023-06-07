package com.gyq.product.dto;

/**
 * @author GYQ
 * @date 2023/5/16 21:34
 * 前端分页查询品牌管理dto
 */

public class PmsBrandPageDto {
    /**
     * 当前页数
     */
    private Integer page;
    /**
     * 一页条数
     */
    private Integer limit;
    /**
     * 关键字，用来查询品牌名或者检索首字母
     */
    private String key;

    private Integer offset;

    public Integer getOffset() {
        return (page-1)*limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "PmsBrandPageDto{" +
                "page=" + page +
                ", limit=" + limit +
                ", key='" + key + '\'' +
                '}';
    }
}
