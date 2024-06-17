package com.smart.crm.dto;

import io.swagger.models.auth.In;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class CustomerListByNameQry {

    private int id;
    private String customerName;
    private Date createTime;
    private Date updateTime;
    private boolean isDeleted;
    private String companyName;
    private String phone;
    private String email;
    private String address;
    private String business;
    private String remark;
    private String label;
    private String sex;
    private Integer lastQueryCustomerCount;
}
