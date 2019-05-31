package org.ygy.common.simplefsm;

import java.util.Map;

public class SqlFsm<E, T extends FollowEntity, R> {

    private Map<String, FsmEven> actionMap;

    private IFsmAction<E> iFsmAction;

    public E follow(T t) {
        FsmEven fsmEven = actionMap.get(t.getAction());
        t.setCurStates(fsmEven.getCurStates());
        t.setTarState(fsmEven.getTarState());
        return iFsmAction.action(t);
    }


//    public E follow(T t) {
//        FsmEven fsmEven = actionMap.get(t.getAction());
//        t.setCurStates(fsmEven.getCurStates());
//        t.setTarState(fsmEven.getTarState());
//        return iFsmAction.action(t);
//    }
//
//    public abstract void attachOperate(T t);

}
