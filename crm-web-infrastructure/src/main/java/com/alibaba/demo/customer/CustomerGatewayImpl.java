package com.alibaba.demo.customer;

import com.alibaba.demo.domain.customer.Customer;
import com.alibaba.demo.domain.customer.gateway.CustomerGateway;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerGatewayImpl implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer getByById(String customerId) {
        return null;
    }

    @Override
    public Customer add(Customer customer) {
        CustomerDO customerDO = new CustomerDO();
        BeanUtils.copyProperties(customer, customerDO);
        customerMapper.insertCustomer(customerDO);
        return null;
    }

    @Override
    public List<Customer> getAllCustomers(Customer customer) {
        CustomerDO customerDO = new CustomerDO();
        BeanUtils.copyProperties(customer, customerDO);
        List<CustomerDO> allCustomers = customerMapper.getAllCustomers(customerDO);

        List<Customer> list = new ArrayList<>();
        allCustomers.stream().forEach(source -> {
            Customer target = new Customer();
            BeanUtils.copyProperties(source, target);
            list.add(target);
        });

        return list;
    }
}
