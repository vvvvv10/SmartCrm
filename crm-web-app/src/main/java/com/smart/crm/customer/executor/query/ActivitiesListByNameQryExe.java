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
public class ActivitiesListByNameQryExe {

    @Autowired
    private ActivitiesGateway activitiesGateway;

    public MultiResponse<ActivitiesDTO> execute(ActivitiesListByNameQry qry) {
        List<ActivitiesDTO> activitiesDTOS = new ArrayList<>();
        Activities activities = activitiesGateway.getByById(qry.getId());
        if (null == activities) {
            return null;
        }
        ActivitiesDTO activitiesDTO = new ActivitiesDTO();
        BeanUtils.copyProperties(activities, activitiesDTO);
        activitiesDTOS.add(activitiesDTO);
        return MultiResponse.of(activitiesDTOS);
    }
}
