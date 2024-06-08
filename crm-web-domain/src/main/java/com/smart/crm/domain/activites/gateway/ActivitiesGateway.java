package com.smart.crm.domain.activites.gateway;

import com.smart.crm.domain.activites.Activities;

import java.util.List;

public interface ActivitiesGateway {

    Activities getByById(Long customerId);

    List<Activities> selectByActivities(Activities activities);

}
