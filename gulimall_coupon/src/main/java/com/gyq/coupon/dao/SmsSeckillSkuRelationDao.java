package com.gyq.coupon.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.gyq.coupon.entity.SmsSeckillSkuRelation;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-14 22:57:06
 */
public interface SmsSeckillSkuRelationDao extends BaseMapper<SmsSeckillSkuRelation> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<SmsSeckillSkuRelation> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<SmsSeckillSkuRelation> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<SmsSeckillSkuRelation> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<SmsSeckillSkuRelation> entities);

}

