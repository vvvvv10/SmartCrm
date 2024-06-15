
package com.smart.crm.customer.executor;

import com.alibaba.cola.dto.Response;
import com.smart.crm.domain.activites.Activities;
import com.smart.crm.domain.activites.gateway.ActivitiesGateway;
import com.smart.crm.domain.customer.Customer;
import com.smart.crm.domain.customer.gateway.CustomerGateway;
import com.smart.crm.dto.ActivitiesAddCmd;
import com.smart.crm.dto.CustomerAddCmd;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ActivitiesAddCmdExe {
    @Autowired
    private ActivitiesGateway activitiesGateway;

    public Response execute(ActivitiesAddCmd cmd) {
        //The flow of usecase is defined here.
        //The core ablility should be implemented in Domain. or sink to Domian gradually
//        if(cmd.getCustomerDTO().getCompanyName().equals("ConflictCompanyName")){
//            throw new BizException(ErrorCode.B_CUSTOMER_companyNameConflict.getErrCode(), "公司名冲突");
//        }
        Activities activities = new Activities();
        BeanUtils.copyProperties(cmd, activities);
        activitiesGateway.add(activities);
        return Response.buildSuccess();
    }

}
