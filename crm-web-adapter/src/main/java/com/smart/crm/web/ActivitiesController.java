package com.smart.crm.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.smart.crm.api.ActivitiesServiceI;
import com.smart.crm.dto.ActivitiesAddCmd;
import com.smart.crm.dto.ActivitiesListByNameQry;
import com.smart.crm.dto.data.ActivitiesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author bob
 * @since 2024-06-04
 */
@RestController
@RequestMapping("/api/v1/activities")
public class ActivitiesController {

    @Autowired
    private ActivitiesServiceI activitiesService;

    @PostMapping(value = "/queryActivities")
    public MultiResponse<ActivitiesDTO> listCustomerByCustomer(@RequestBody ActivitiesListByNameQry qry) {
        return activitiesService.listByCustomer(qry);
    }

    @PostMapping(value = "/addActivities")
    public Response addActivities(@RequestBody ActivitiesAddCmd cmd) {
        cmd.setStatus("1");
        cmd.setUserId("1000");
        return activitiesService.addActivities(cmd);
    }
}
