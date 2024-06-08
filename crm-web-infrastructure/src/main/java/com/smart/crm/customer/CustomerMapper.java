package com.smart.crm.customer;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper{

  CustomerDO getCustomerById(String customerId);

  List<CustomerDO> getAllCustomers(CustomerDO customerDO);

  void insertCustomer(CustomerDO customerDO);
}
