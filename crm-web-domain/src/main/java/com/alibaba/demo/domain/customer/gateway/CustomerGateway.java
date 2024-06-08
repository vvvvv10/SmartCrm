package com.alibaba.demo.domain.customer.gateway;

import com.alibaba.demo.domain.customer.Customer;

import java.util.List;

public interface CustomerGateway {
    Customer getByById(String customerId);

    List<Customer> getAllCustomers(Customer customer);

    Customer add(Customer customer);
}
