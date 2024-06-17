package com.smart.crm.domain.customer.gateway;

import com.smart.crm.domain.customer.Customer;
import com.smart.crm.dto.CustomerListByNameQry;

import java.util.List;

public interface CustomerGateway {
    Customer getByById(String customerId);

    List<Customer> getAllCustomers(CustomerListByNameQry qry);

    Customer add(Customer customer);
}
