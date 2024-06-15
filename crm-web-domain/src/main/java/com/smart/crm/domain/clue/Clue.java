package com.smart.crm.domain.clue;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Clue implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String activityName;

    private String department;

    private String userId;

    private String status;

    private LocalDateTime startTime;

    private LocalDateTime endTime;


}
