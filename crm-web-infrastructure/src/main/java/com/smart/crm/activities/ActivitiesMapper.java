package com.smart.crm.activities;

import com.smart.crm.customer.ActivitiesDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

//    @Select("select * from activities where id = #{id}")
    com.smart.crm.customer.ActivitiesDO getById(@Param("id") Long id);

    List<com.smart.crm.customer.ActivitiesDO> selectByActivities(ActivitiesDO activitiesDO);

}
