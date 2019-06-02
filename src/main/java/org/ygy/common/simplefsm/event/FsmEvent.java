package org.ygy.common.simplefsm.event;

import java.util.List;
import java.util.Map;

public class FsmEvent {

    private String action;
    private String type;
    private List<String> curStates;
    private String tarState;

    // TODO 用于额外操作的数据
    private Map<String, Object> data;

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

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
