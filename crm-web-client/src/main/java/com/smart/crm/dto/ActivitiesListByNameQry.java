package com.smart.crm.dto;

import com.alibaba.cola.dto.Query;
import io.swagger.models.auth.In;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivitiesListByNameQry extends Query{

   private Long id;

   private String activityName;

   private String department;

   private String userId;

   private String status;

   private Date startTime;

   private Date endTime;

   private Integer current;

   private Integer pageSize;
}
