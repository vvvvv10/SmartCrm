package com.smart.crm.customer;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.smart.crm.api.ActivitiesServiceI;
import com.smart.crm.customer.executor.CustomerAddCmdExe;
import com.smart.crm.customer.executor.query.ActivitiesListByActivitiesQryExe;
import com.smart.crm.dto.ActivitiesAddCmd;
import com.smart.crm.dto.ActivitiesListByNameQry;
import com.smart.crm.dto.CustomerAddCmd;
import com.smart.crm.dto.data.ActivitiesDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
@CatchAndLog
public class ActivitiesServiceImpl implements ActivitiesServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private ActivitiesListByActivitiesQryExe activitiesListByActivitiesQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public Response addCustomer(ActivitiesAddCmd activitiesAddCmd) {
        return null;
    }

    @Override
    public MultiResponse<ActivitiesDTO> listByCustomer(ActivitiesListByNameQry activitiesListByNameQry) {
        return null;
    }

    @Override
    public MultiResponse<ActivitiesDTO> listByName(ActivitiesListByNameQry qry) {
        return activitiesListByActivitiesQryExe.execute(qry);
    }
}