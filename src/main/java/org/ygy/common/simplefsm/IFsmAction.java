package org.ygy.common.simplefsm;

public interface IFsmAction<E> {

    E action(FollowEntity followEntity);
}
