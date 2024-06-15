package com.smart.crm.dto;

import com.alibaba.cola.dto.Query;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class ActivitiesAddCmd extends Query{

   private String activityName;

   private String department;

   private String userId;

   private String status;

   private Date startTime;

   private Date endTime;
}
