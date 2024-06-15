package com.smart.crm.customer;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.smart.crm.api.ActivitiesServiceI;
import com.smart.crm.customer.executor.ActivitiesAddCmdExe;
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
    private ActivitiesAddCmdExe activitiesAddCmdExe;

    @Resource
    private ActivitiesListByActivitiesQryExe activitiesListByActivitiesQryExe;

    @Override
    public Response addActivities(ActivitiesAddCmd cmd) {
        return activitiesAddCmdExe.execute(cmd);
    }

    @Override
    public MultiResponse<ActivitiesDTO> listByCustomer(ActivitiesListByNameQry qry) {
        return activitiesListByActivitiesQryExe.execute(qry);
    }

    @Override
    public MultiResponse<ActivitiesDTO> listByName(ActivitiesListByNameQry qry) {
        return activitiesListByActivitiesQryExe.execute(qry);
    }
}