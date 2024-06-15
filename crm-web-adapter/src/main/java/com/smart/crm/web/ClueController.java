package com.smart.crm.web;

import com.alibaba.cola.dto.Response;
import com.smart.crm.api.ClueServiceI;
import com.smart.crm.dto.ClueAddCmd;
import com.smart.crm.dto.ClueListByNameQry;
import com.smart.crm.dto.CustomerAddCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bob
 * @since 2024-06-04
 */
@RestController
@RequestMapping("/api/v1/clue")
public class ClueController {

    @Autowired
    private ClueServiceI clueServiceI;

    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hello, welcome to COLA world!";
    }

    @PostMapping(value = "/addClue")
    public Response addClue(@RequestBody ClueAddCmd cmd){
        return clueServiceI.addClue(cmd);
    }

    @PostMapping(value = "/queryClue")
    public Response queryClue(@RequestBody ClueListByNameQry qry){
        return clueServiceI.listByClue(qry);
    }
}
