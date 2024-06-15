package com.smart.crm.dto.data;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerDTO {
    private int id;
    private String customerName;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private boolean isDeleted;
    private String companyName;
    private String phone;
    private String email;
    private String address;
    private String business;
    private String remark;
    private String label;
    private String sex;
}
