package com.smart.crm.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.smart.crm.dto.CustomerListByNameQry;
import com.smart.crm.dto.data.CustomerDTO;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class CustomerListByNameQryExe{
    public MultiResponse<CustomerDTO> execute(CustomerListByNameQry cmd) {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        CustomerDTO customerDTO = new CustomerDTO();

        customerDTOList.add(customerDTO);
        return MultiResponse.of(customerDTOList);
    }
}
