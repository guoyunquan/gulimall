package com.gyq.coupon.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.gyq.coupon.entity.SmsHomeSubject;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
public interface SmsHomeSubjectDao extends BaseMapper<SmsHomeSubject> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<SmsHomeSubject> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<SmsHomeSubject> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<SmsHomeSubject> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<SmsHomeSubject> entities);

}

