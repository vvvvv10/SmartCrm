package com.alibaba.demo.customer;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author bob
 * @since 2024-06-04
 */
@Getter
@Setter
public class ClueDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String status;

    private String name;

    private String tel;

    private String companyName;

    private String companyTel;

    private String companyPersonName;

    private String companyPersonTel;

    private String companyPersonSex;

    private String companyPersonEmail;

    private String companyAddress;

    private String jobTitle;

    private LocalDateTime createTime;

    private LocalDateTime lastUpdateTime;

    private LocalDateTime assignTime;

    private String clueSource;

    private String activityName;

    private String department;

    private String person;

    private String remark;
}
