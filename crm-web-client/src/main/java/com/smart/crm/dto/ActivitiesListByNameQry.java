package com.smart.crm.dto;

import com.alibaba.cola.dto.Query;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
public class ActivitiesListByNameQry extends Query{

   private Long id;

   private String activityName;

   private String department;

   private String person;

   private String status;

   private LocalDateTime startTime;

   private LocalDateTime endTime;
}
