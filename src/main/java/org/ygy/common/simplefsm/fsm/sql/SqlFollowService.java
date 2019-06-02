package org.ygy.common.simplefsm.fsm.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ygy.common.simplefsm.event.FsmEvent;

@Service
public class SqlFollowService {

    @Autowired
    private SqlFollowDao sqlFollowDao;

    // TODO 事务
    public int updateState(FsmEvent fsmEvent) {
        return 0;
    }

}
