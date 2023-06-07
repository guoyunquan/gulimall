package com.gyq.common;

import java.io.Serializable;
import java.util.List;

/**
 * @author GYQ
 * @date 2023/5/16 23:55
 */

public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 5038168349848534276L;
    /**
     * 当前页数
     */
    private Integer current;

    /**
     * 每页条数
     */
    private Integer size;

    /**
     * 总条数
     */
    private Integer total;

    /**
     * 数据集合
     */
    private List<T> list;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "current=" + current +
                ", size=" + size +
                ", total=" + total +
                ", list=" + list +
                '}';
    }
}
