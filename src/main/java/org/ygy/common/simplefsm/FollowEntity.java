package org.ygy.common.simplefsm;

import java.util.List;

public class FollowEntity {

    private String action;
    private List<String> curStates;
    private String tarState;
    private Long id;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<String> getCurStates() {
        return curStates;
    }

    public void setCurStates(List<String> curStates) {
        this.curStates = curStates;
    }

    public String getTarState() {
        return tarState;
    }

    public void setTarState(String tarState) {
        this.tarState = tarState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
