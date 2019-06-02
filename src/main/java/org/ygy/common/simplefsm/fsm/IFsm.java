package org.ygy.common.simplefsm.fsm;

import org.ygy.common.simplefsm.action.IFsmAction;
import org.ygy.common.simplefsm.config.FsmConfig;
import org.ygy.common.simplefsm.event.FsmEvent;

import java.util.Map;

public abstract class IFsm<R> {

    protected FsmConfig fsmConfig;
    protected Map<String, IFsmAction> actionMap;

    public void init() {
        // 解析json到fsmConfig
    }

    public abstract R stateFollow(FsmEvent fsmEvent);

    public abstract R action(FsmEvent fsmEvent);


}
