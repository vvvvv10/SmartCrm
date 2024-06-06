package com.alibaba.demo.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.demo.domain.activites.Activities;
import com.alibaba.demo.domain.activites.gateway.ActivitiesGateway;
import com.alibaba.demo.dto.ActivitiesListByNameQry;
import com.alibaba.demo.dto.CustomerListByNameQry;
import com.alibaba.demo.dto.data.ActivitiesDTO;
import com.alibaba.demo.dto.data.CustomerDTO;
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
