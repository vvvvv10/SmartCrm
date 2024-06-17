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
public class ClientInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String clientName;

    private Date createTime;

    private Date assignTime;

    private Integer clueId;

    private LocalDateTime lastUpdateTime;

    private LocalDateTime nextUpdateTime;

    private Integer followManId;
}
