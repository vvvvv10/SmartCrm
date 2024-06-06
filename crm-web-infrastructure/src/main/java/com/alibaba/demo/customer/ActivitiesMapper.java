package com.alibaba.demo.customer;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author bob
 * @since 2024-06-04
 */
@Mapper
public interface ActivitiesMapper {

    @Select("select * from activities where id = #{id}")
    ActivitiesDO getById(@Param("id") String id);

}
