package org.ygy.common.simplefsm.event;

import org.apache.commons.lang.StringUtils;

public enum FsmEventType {

    In("in"){
        @Override
        public FsmEvent tran2InType(FsmEvent fsmEvent) {
            return fsmEvent;
        }
    },Gt("gt"){
        @Override
        public FsmEvent tran2InType(FsmEvent fsmEvent) {
            return null;
        }
    },Gtq("gtq"){
        @Override
        public FsmEvent tran2InType(FsmEvent fsmEvent) {
            return null;
        }
    },Lt("lt"){
        @Override
        public FsmEvent tran2InType(FsmEvent fsmEvent) {
            return null;
        }
    },Ltq("ltq"){
        @Override
        public FsmEvent tran2InType(FsmEvent fsmEvent) {
            return null;
        }
    },Default(""){
        @Override
        public FsmEvent tran2InType(FsmEvent fsmEvent) {
            return null;
        }
    };

    public static FsmEventType getByName(String name) {
        if (StringUtils.isBlank(name)) {
            return Default;
        }
        for (FsmEventType fsmEventType : FsmEventType.values()) {
            if (fsmEventType.getName().equals(name)) {
                return fsmEventType;
            }
        }
        return Default;
    }

    private String name;

    public String validate(FsmEvent fsmEvent) {
        return null;
    }
    public abstract FsmEvent tran2InType(FsmEvent fsmEvent);

    FsmEventType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
