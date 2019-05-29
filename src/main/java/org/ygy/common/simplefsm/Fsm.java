package org.ygy.common.simplefsm;

import java.util.Map;

public abstract class Fsm<E> {

    private Map<String, FsmEven> actionMap;

    private IFsmAction<E> iFsmAction;

    public E follow(FollowEntity followEntity) {
        FsmEven fsmEven = actionMap.get(followEntity.getAction());
        followEntity.setCurStates(fsmEven.getCurStates());
        followEntity.setTarState(fsmEven.getTarState());
        return iFsmAction.action(followEntity);
    }

}
