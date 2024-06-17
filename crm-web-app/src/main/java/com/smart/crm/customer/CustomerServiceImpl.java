package com.smart.crm.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.smart.crm.dto.CustomerAddCmd;
import com.smart.crm.api.CustomerServiceI;
import com.smart.crm.customer.executor.query.CustomerListByCustomerQryExe;
import com.smart.crm.dto.CustomerListByNameQry;
import com.smart.crm.dto.data.CustomerDTO;
import com.smart.crm.customer.executor.CustomerAddCmdExe;
import com.smart.crm.customer.executor.query.CustomerListByNameQryExe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
//@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    @Resource
    private CustomerListByCustomerQryExe customerListByCustomerQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

    @Override
    public MultiResponse<CustomerDTO> listByCustomer(CustomerListByNameQry customerListByNameQry) {
        return customerListByCustomerQryExe.execute(customerListByNameQry);
    }

}