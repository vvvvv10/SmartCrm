package com.alibaba.demo.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.demo.dto.CustomerAddCmd;
import com.alibaba.demo.api.CustomerServiceI;
import com.alibaba.demo.customer.executor.query.CustomerListByCustomerQryExe;
import com.alibaba.demo.dto.CustomerListByNameQry;
import com.alibaba.demo.dto.data.CustomerDTO;
import org.springframework.stereotype.Service;

import com.alibaba.demo.customer.executor.CustomerAddCmdExe;
import com.alibaba.demo.customer.executor.query.CustomerListByNameQryExe;

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