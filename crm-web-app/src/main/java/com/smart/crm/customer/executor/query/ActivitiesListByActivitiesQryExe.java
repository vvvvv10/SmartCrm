package com.smart.crm.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.smart.crm.domain.activites.Activities;
import com.smart.crm.domain.activites.gateway.ActivitiesGateway;
import com.smart.crm.dto.ActivitiesListByNameQry;
import com.smart.crm.dto.data.ActivitiesDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ActivitiesListByActivitiesQryExe {

    @Autowired
    private ActivitiesGateway activitiesGateway;

    public MultiResponse<ActivitiesDTO> execute(ActivitiesListByNameQry qry) {
        Activities activities1 = new Activities();
        BeanUtils.copyProperties(qry, activities1);
        List<Activities> activities = activitiesGateway.selectByActivities(activities1);

        List<ActivitiesDTO> activities2 = new ArrayList<>();
        activities.stream().forEach(source -> {
            ActivitiesDTO target = new ActivitiesDTO();
            BeanUtils.copyProperties(source, target);
            activities2.add(target);
        });

        return MultiResponse.of(activities2);
    }
}
