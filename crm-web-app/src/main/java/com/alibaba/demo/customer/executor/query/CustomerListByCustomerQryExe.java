package com.alibaba.demo.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.demo.domain.customer.Customer;
import com.alibaba.demo.domain.customer.gateway.CustomerGateway;
import com.alibaba.demo.dto.CustomerListByNameQry;
import com.alibaba.demo.dto.data.CustomerDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CustomerListByCustomerQryExe {
    @Autowired
    private CustomerGateway customerGateway;

    public MultiResponse<CustomerDTO> execute(CustomerListByNameQry cmd) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(cmd, customer);
        List<Customer> allCustomers = customerGateway.getAllCustomers(customer);
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
