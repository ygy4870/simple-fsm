package org.ygy.common.simplefsm;

public abstract class IFsm<E, T extends FollowEntity, R> {

    /**
     *
     * @param t
     * @return
     */
    public abstract E follow(T t);

    /**
     *
     * @param t
     * @return
     */
    public abstract R attachOperate(T t);

}
