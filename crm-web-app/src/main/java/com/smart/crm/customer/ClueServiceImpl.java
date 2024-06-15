package com.smart.crm.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.smart.crm.api.ClueServiceI;
import com.smart.crm.api.CustomerServiceI;
import com.smart.crm.customer.executor.ClueAddCmdExe;
import com.smart.crm.customer.executor.CustomerAddCmdExe;
import com.smart.crm.customer.executor.query.ClueListByClueQryExe;
import com.smart.crm.customer.executor.query.CustomerListByCustomerQryExe;
import com.smart.crm.customer.executor.query.CustomerListByNameQryExe;
import com.smart.crm.dto.ClueAddCmd;
import com.smart.crm.dto.ClueListByNameQry;
import com.smart.crm.dto.CustomerAddCmd;
import com.smart.crm.dto.CustomerListByNameQry;
import com.smart.crm.dto.data.ClueDTO;
import com.smart.crm.dto.data.CustomerDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
//@CatchAndLog
public class ClueServiceImpl implements ClueServiceI {

    @Resource
    private ClueAddCmdExe clueAddCmdExe;

    @Resource
    private ClueListByClueQryExe clueListByClueQryExe;

    @Override
    public Response addClue(ClueAddCmd clueAddCmd) {
        clueAddCmdExe.execute(clueAddCmd);
        return null;
    }

    @Override
    public MultiResponse<ClueDTO> listByName(ClueListByNameQry clueListByNameQry) {
        return null;
    }

    @Override
    public MultiResponse<ClueDTO> listByClue(ClueListByNameQry qry) {
        return clueListByClueQryExe.execute(qry);
    }
}