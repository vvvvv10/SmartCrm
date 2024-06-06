package com.alibaba.demo.domain.activites.gateway;

import com.alibaba.demo.domain.activites.Activities;

public interface ActivitiesGateway {

    Activities getByById(String customerId);

}
