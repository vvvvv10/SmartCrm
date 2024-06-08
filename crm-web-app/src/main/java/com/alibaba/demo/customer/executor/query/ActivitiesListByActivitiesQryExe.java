package com.alibaba.demo.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.demo.domain.activites.Activities;
import com.alibaba.demo.domain.activites.gateway.ActivitiesGateway;
import com.alibaba.demo.dto.ActivitiesListByNameQry;
import com.alibaba.demo.dto.data.ActivitiesDTO;
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
        List<ActivitiesDTO> activitiesDTOS = new ArrayList<>();
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
