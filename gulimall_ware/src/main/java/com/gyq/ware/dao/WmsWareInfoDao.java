package com.gyq.ware.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.gyq.ware.entity.WmsWareInfo;

/**
 * 仓库信息(WmsWareInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-14 22:54:47
 */
public interface WmsWareInfoDao extends BaseMapper<WmsWareInfo> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<WmsWareInfo> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<WmsWareInfo> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<WmsWareInfo> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<WmsWareInfo> entities);

}

