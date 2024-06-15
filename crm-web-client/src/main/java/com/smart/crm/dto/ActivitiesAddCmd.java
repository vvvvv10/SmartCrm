package com.smart.crm.dto;

import com.alibaba.cola.dto.Query;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ActivitiesAddCmd extends Query{

   private String activityName;

   private String department;

   private String userId;

   private String status;

   private LocalDateTime startTime;

   private LocalDateTime endTime;
}
