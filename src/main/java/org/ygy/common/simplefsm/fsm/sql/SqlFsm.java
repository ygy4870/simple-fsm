package org.ygy.common.simplefsm.fsm.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.ygy.common.simplefsm.action.IFsmAction;
import org.ygy.common.simplefsm.event.FsmEvent;
import org.ygy.common.simplefsm.fsm.IFsm;

public class SqlFsm extends IFsm<Integer> {

    @Autowired
    private SqlFollowService sqlFollowService;

    @Override
    public Integer stateFollow(FsmEvent param) {
        FsmEvent fsmEvent = fsmConfig.getEventMap().get(param.getAction());
        param.setCurStates(fsmEvent.getCurStates());
        param.setTarState(fsmEvent.getTarState());
        return sqlFollowService.updateState(param);
    }

    // TODO 事务
    @Override
    public Integer action(FsmEvent param) {
        IFsmAction iFsmAction = actionMap.get(param.getAction());
        if (null != iFsmAction) {
            iFsmAction.action(param);
            // log
        } else {
            // log
        }
        Integer rows = this.stateFollow(param);
        if (rows < 1) {
            // log
            throw new RuntimeException("");
        }
        return rows;
    }


}
