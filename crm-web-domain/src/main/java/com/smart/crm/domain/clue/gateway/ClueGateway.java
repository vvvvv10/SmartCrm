package com.smart.crm.domain.clue.gateway;

import com.smart.crm.domain.clue.Clue;

import java.util.List;

public interface ClueGateway {

    Clue getByById(Long customerId);

    Clue add(Clue clue);

    List<Clue> selectByActivities(Clue clue);

}
