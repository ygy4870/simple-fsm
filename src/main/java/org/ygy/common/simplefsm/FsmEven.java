package org.ygy.common.simplefsm;

import java.util.List;

public class FsmEven {

    private String action;
    private String type;
    private List<String> curStates;
    private String tarState;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}
