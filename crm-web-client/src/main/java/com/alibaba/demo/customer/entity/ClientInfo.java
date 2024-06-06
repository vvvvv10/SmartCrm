package com.alibaba.demo.customer.entity;

import lombok.Getter;
import lombok.Setter;

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
@Getter
@Setter
public class ClientInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String clientName;

    private LocalDateTime createTime;

    private LocalDateTime assignTime;

    private Integer clueId;

    private LocalDateTime lastUpdateTime;

    private LocalDateTime nextUpdateTime;

    private Integer followManId;
}
