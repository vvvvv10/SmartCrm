package com.smart.crm.domain.customer;

import com.alibaba.cola.domain.Entity;
import com.alibaba.cola.exception.BizException;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

//Domain Entity can choose to extend the domain model which is used for DTO
@Data
@Entity
public class Customer{

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

    public Customer() {
    }

//    public boolean isBigCompany() {
//        return registeredCapital > 10000000; //注册资金大于1000万的是大企业
//    }
//
//    public boolean isSME() {
//        return registeredCapital > 10000 && registeredCapital < 1000000; //注册资金大于10万小于100万的为中小企业
//    }

    public void checkConflict(){
        //Per different biz, the check policy could be different, if so, use ExtensionPoint
        if("ConflictCompanyName".equals(this.companyName)){
            throw new BizException(this.companyName+" has already existed, you can not add it");
        }

    }
}
