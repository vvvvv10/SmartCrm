package com.smart.crm.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerAddCmd {

    private String customerName;
    private String companyName;
    private String phone;
    private String email;
    private String address;
    private String business;
    private String remark;
    private String sex;

}
