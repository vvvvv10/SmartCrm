package com.alibaba.demo.activities;

import com.alibaba.demo.customer.ActivitiesDO;
import com.alibaba.demo.domain.activites.Activities;
import com.alibaba.demo.domain.activites.gateway.ActivitiesGateway;
import com.alibaba.demo.domain.customer.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActivitiesGatewayImpl implements ActivitiesGateway {
    @Autowired
    private ActivitiesMapper activitiesMapper;

    public Activities getByById(Long id) {
        ActivitiesDO activitiesDO = activitiesMapper.getById(id);
        if (null == activitiesDO) {
            return null;
        }
        Activities activities = new Activities();
        BeanUtils.copyProperties(activitiesDO, activities);
        return activities;
    }

    @Override
    public List<Activities> selectByActivities(Activities activities) {
        ActivitiesDO activitiesDO = new ActivitiesDO();
        BeanUtils.copyProperties(activities, activitiesDO);
        List<ActivitiesDO> activitiesDOS = activitiesMapper.selectByActivities(activitiesDO);

        List<Activities> activities1 = new ArrayList<>();
        activitiesDOS.stream().forEach(source -> {
            Activities target = new Activities();
            BeanUtils.copyProperties(source, target);
            activities1.add(target);
        });
        return activities1;
    }
}
