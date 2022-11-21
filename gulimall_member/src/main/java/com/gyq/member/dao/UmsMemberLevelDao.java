package com.gyq.member.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.gyq.member.entity.UmsMemberLevel;

/**
 * 会员等级(UmsMemberLevel)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-14 22:56:13
 */
public interface UmsMemberLevelDao extends BaseMapper<UmsMemberLevel> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<UmsMemberLevel> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<UmsMemberLevel> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<UmsMemberLevel> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<UmsMemberLevel> entities);

}

