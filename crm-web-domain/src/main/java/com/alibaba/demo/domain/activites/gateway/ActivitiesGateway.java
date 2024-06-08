package com.alibaba.demo.domain.activites.gateway;

import com.alibaba.demo.domain.activites.Activities;

import java.util.List;

public interface ActivitiesGateway {

    Activities getByById(Long customerId);

    List<Activities> selectByActivities(Activities activities);

}
