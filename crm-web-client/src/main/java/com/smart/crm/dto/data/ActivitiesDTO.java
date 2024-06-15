package com.smart.crm.dto.data;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

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
public class ActivitiesDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String activityName;

    private String department;

    private String userId;

    private String status;

    private Date startTime;

    private Date endTime;

    private String userName;

    private String activityContent;

    public String getUserName() {
        return "测试用户"+"("+userId+")";
    }

    public String getActivityContent() {
        return "活动内容";
    }
}
