package com.smart.crm.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.smart.crm.domain.clue.Clue;
import com.smart.crm.domain.clue.gateway.ClueGateway;
import com.smart.crm.domain.customer.Customer;
import com.smart.crm.domain.customer.gateway.CustomerGateway;
import com.smart.crm.dto.ClueListByNameQry;
import com.smart.crm.dto.CustomerListByNameQry;
import com.smart.crm.dto.data.ClueDTO;
import com.smart.crm.dto.data.CustomerDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ClueListByClueQryExe {
    @Autowired
    private ClueGateway clueGateway;

    public MultiResponse<ClueDTO> execute(ClueListByNameQry qry) {
        Clue clue = new Clue();
        BeanUtils.copyProperties(qry, clue);
        List<Clue> clues = clueGateway.selectByActivities(clue);
        List<ClueDTO> customerDTOList = new ArrayList<>();

        clues.stream().forEach(source -> {
            ClueDTO target = new ClueDTO();
            try {
                BeanUtils.copyProperties(source, target);
                customerDTOList.add(target);
            } catch (Exception e) {
                // 异常处理
            }
        });
        return MultiResponse.of(customerDTOList);
    }
}
