package com.alibaba.demo.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.demo.dto.ActivitiesAddCmd;
import com.alibaba.demo.dto.ActivitiesListByNameQry;
import com.alibaba.demo.dto.CustomerAddCmd;
import com.alibaba.demo.dto.CustomerListByNameQry;
import com.alibaba.demo.dto.data.ActivitiesDTO;
import com.alibaba.demo.dto.data.CustomerDTO;

public interface ActivitiesServiceI {

    Response addCustomer(ActivitiesAddCmd activitiesAddCmd);

    MultiResponse<ActivitiesDTO> listByName(ActivitiesListByNameQry activitiesListByNameQry);

    MultiResponse<ActivitiesDTO> listByCustomer(ActivitiesListByNameQry activitiesListByNameQry);

}
