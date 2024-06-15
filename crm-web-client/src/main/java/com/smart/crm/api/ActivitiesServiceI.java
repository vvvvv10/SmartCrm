package com.smart.crm.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.smart.crm.dto.ActivitiesAddCmd;
import com.smart.crm.dto.ActivitiesListByNameQry;
import com.smart.crm.dto.data.ActivitiesDTO;

public interface ActivitiesServiceI {

    Response addActivities(ActivitiesAddCmd activitiesAddCmd);

    MultiResponse<ActivitiesDTO> listByName(ActivitiesListByNameQry activitiesListByNameQry);

    MultiResponse<ActivitiesDTO> listByCustomer(ActivitiesListByNameQry activitiesListByNameQry);

}
