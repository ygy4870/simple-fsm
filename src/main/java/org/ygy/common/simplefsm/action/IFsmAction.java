package org.ygy.common.simplefsm.action;

import org.ygy.common.simplefsm.event.FsmEvent;

public interface IFsmAction<R> {

    R action(FsmEvent fsmEvent);

}
