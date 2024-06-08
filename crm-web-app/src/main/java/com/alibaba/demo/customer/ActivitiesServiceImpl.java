package com.alibaba.demo.customer;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.demo.api.ActivitiesServiceI;
import com.alibaba.demo.customer.executor.CustomerAddCmdExe;
import com.alibaba.demo.customer.executor.query.ActivitiesListByActivitiesQryExe;
import com.alibaba.demo.customer.executor.query.ActivitiesListByNameQryExe;
import com.alibaba.demo.customer.executor.query.CustomerListByNameQryExe;
import com.alibaba.demo.dto.ActivitiesListByNameQry;
import com.alibaba.demo.dto.CustomerAddCmd;
import com.alibaba.demo.dto.CustomerListByNameQry;
import com.alibaba.demo.dto.data.ActivitiesDTO;
import com.alibaba.demo.dto.data.CustomerDTO;
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
    public MultiResponse<ActivitiesDTO> listByName(ActivitiesListByNameQry qry) {
        return activitiesListByActivitiesQryExe.execute(qry);
    }
}