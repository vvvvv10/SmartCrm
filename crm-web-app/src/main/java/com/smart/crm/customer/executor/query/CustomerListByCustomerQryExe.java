package com.smart.crm.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.smart.crm.domain.customer.Customer;
import com.smart.crm.domain.customer.gateway.CustomerGateway;
import com.smart.crm.dto.CustomerListByNameQry;
import com.smart.crm.dto.data.CustomerDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CustomerListByCustomerQryExe {
    @Autowired
    private CustomerGateway customerGateway;

    public MultiResponse<CustomerDTO> execute(CustomerListByNameQry qry) {
        List<Customer> allCustomers = customerGateway.getAllCustomers(qry);
        List<CustomerDTO> customerDTOList = new ArrayList<>();

        allCustomers.stream().forEach(source -> {
            CustomerDTO target = new CustomerDTO();
            try {
                BeanUtils.copyProperties(source, target);
                customerDTOList.add(target);
            } catch (Exception e) {
                // 异常处理
            }
        });
        return MultiResponse.of(customerDTOList);
    }
}
