package com.smart.crm.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.smart.crm.dto.ClueAddCmd;
import com.smart.crm.dto.ClueListByNameQry;
import com.smart.crm.dto.CustomerAddCmd;
import com.smart.crm.dto.CustomerListByNameQry;
import com.smart.crm.dto.data.ClueDTO;
import com.smart.crm.dto.data.CustomerDTO;

public interface ClueServiceI {

    Response addClue(ClueAddCmd clueAddCmd);

    MultiResponse<ClueDTO> listByName(ClueListByNameQry clueListByNameQry);

    MultiResponse<ClueDTO> listByClue(ClueListByNameQry clueListByNameQry);

}
