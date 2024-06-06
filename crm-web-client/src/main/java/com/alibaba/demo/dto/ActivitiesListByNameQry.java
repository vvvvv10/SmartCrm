package com.alibaba.demo.dto;

import com.alibaba.cola.dto.Query;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ActivitiesListByNameQry extends Query{

   @Setter
   @Getter
   private String id;
}
