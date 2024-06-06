package com.alibaba.demo.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.demo.api.ActivitiesServiceI;
import com.alibaba.demo.dto.ActivitiesListByNameQry;
import com.alibaba.demo.dto.data.ActivitiesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
public class ActivitiesController {

    @Autowired
    private ActivitiesServiceI activitiesService;

    @GetMapping(value = "/helloworld1")
    public String helloWorld() {
        return "Hello, welcome to COLA world!";
    }

    @PostMapping(value = "/activities")
    public MultiResponse<ActivitiesDTO> listCustomerByName(@RequestBody ActivitiesListByNameQry qry) {
        return activitiesService.listByName(qry);
    }
}
