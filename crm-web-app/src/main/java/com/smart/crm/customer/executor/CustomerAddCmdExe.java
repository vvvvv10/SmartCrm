
package com.smart.crm.customer.executor;

import com.alibaba.cola.dto.Response;
import com.smart.crm.domain.customer.Customer;
import com.smart.crm.domain.customer.gateway.CustomerGateway;
import com.smart.crm.dto.CustomerAddCmd;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerAddCmdExe{
    @Autowired
    private CustomerGateway customerGateway;

    public Response execute(CustomerAddCmd cmd) {
        //The flow of usecase is defined here.
        //The core ablility should be implemented in Domain. or sink to Domian gradually
//        if(cmd.getCustomerDTO().getCompanyName().equals("ConflictCompanyName")){
//            throw new BizException(ErrorCode.B_CUSTOMER_companyNameConflict.getErrCode(), "公司名冲突");
//        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(cmd, customer);
        customerGateway.add(customer);
        return Response.buildSuccess();
    }

}
