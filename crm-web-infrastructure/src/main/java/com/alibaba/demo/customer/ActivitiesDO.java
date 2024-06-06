package com.alibaba.demo.customer;

import lombok.Data;

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
@Data
public class ActivitiesDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String activityName;

    private String department;

    private String person;

    private String status;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
