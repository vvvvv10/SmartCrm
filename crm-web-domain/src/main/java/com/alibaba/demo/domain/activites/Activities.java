package com.alibaba.demo.domain.activites;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Activities implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String activityName;

    private String department;

    private String person;

    private String status;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
