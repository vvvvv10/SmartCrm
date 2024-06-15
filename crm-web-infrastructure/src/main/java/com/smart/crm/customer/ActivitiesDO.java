package com.smart.crm.customer;

import lombok.Data;

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
@Data
public class ActivitiesDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String activityName;

    private String department;

    private String userId;

    private String status;

    private Date startTime;

    private Date endTime;
}
