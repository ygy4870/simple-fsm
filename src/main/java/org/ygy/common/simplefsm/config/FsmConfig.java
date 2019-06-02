package org.ygy.common.simplefsm.config;

import org.ygy.common.simplefsm.event.FsmEvent;

import java.util.List;
import java.util.Map;

public class FsmConfig {

    private String tableName;
    private String pkName;
    private String stateName;
    private List<String> states;
    private List<FsmEvent> fsmEvents;

    //
    private Map<String, FsmEvent> eventMap;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPkName() {
        return pkName;
    }

    public void setPkName(String pkName) {
        this.pkName = pkName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<FsmEvent> getFsmEvents() {
        return fsmEvents;
    }

    public void setFsmEvents(List<FsmEvent> fsmEvents) {
        this.fsmEvents = fsmEvents;
    }

    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public Map<String, FsmEvent> getEventMap() {
        return eventMap;
    }

    public void setEventMap(Map<String, FsmEvent> eventMap) {
        this.eventMap = eventMap;
    }
}
