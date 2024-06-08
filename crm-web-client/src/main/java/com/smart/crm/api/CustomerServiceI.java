package com.smart.crm.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.smart.crm.dto.CustomerAddCmd;
import com.smart.crm.dto.CustomerListByNameQry;
import com.smart.crm.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);

    MultiResponse<CustomerDTO> listByCustomer(CustomerListByNameQry customerListByNameQry);

}
