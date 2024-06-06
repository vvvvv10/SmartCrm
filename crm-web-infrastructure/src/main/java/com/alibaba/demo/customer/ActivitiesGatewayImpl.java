package com.alibaba.demo.customer;

import com.alibaba.demo.domain.activites.Activities;
import com.alibaba.demo.domain.activites.gateway.ActivitiesGateway;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActivitiesGatewayImpl implements ActivitiesGateway {
    @Autowired
    private ActivitiesMapper activitiesMapper;

    public Activities getByById(String id) {
        ActivitiesDO activitiesDO = activitiesMapper.getById(id);
        if (null == activitiesDO) {
            return null;
        }
        Activities activities = new Activities();
        BeanUtils.copyProperties(activitiesDO, activities);
        return activities;
    }
}
