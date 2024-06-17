package com.smart.crm.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.smart.crm.api.CustomerServiceI;
import com.smart.crm.dto.CustomerAddCmd;
import com.smart.crm.dto.CustomerListByNameQry;
import com.smart.crm.dto.data.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceI customerService;

    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hello, welcome to COLA world!";
    }

    @PostMapping(value = "/queryCustomer")
    public MultiResponse<CustomerDTO> listCustomerByName(@RequestBody CustomerListByNameQry qry){
        return customerService.listByCustomer(qry);
    }

    @PostMapping(value = "/addCustomer")
    public Response addCustomer(@RequestBody CustomerAddCmd cmd){
        return customerService.addCustomer(cmd);
    }

    @GetMapping(value = "/getCustomerByLastTime")
    public MultiResponse<CustomerDTO> getCustomerByLastTime(){
        CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
        customerListByNameQry.setLastQueryCustomerCount(10);
        return customerService.listByCustomer(customerListByNameQry);
    }
}
