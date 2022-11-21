package com.gyq.ware.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * (UndoLog)表实体类
 *
 * @author makejava
 * @since 2022-11-14 22:54:47
 */
@SuppressWarnings("serial")
public class UndoLog extends Model<UndoLog> {
    
    private Long id;
    
    private Long branchId;
    
    private String xid;
    
    private String context;
    
    private String rollbackInfo;
    
    private Integer logStatus;
    
    private Date logCreated;
    
    private Date logModified;
    
    private String ext;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getRollbackInfo() {
        return rollbackInfo;
    }

    public void setRollbackInfo(String rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
    }

    public Integer getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    public Date getLogCreated() {
        return logCreated;
    }

    public void setLogCreated(Date logCreated) {
        this.logCreated = logCreated;
    }

    public Date getLogModified() {
        return logModified;
    }

    public void setLogModified(Date logModified) {
        this.logModified = logModified;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
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

