package org.ygy.common.simplefsm;

import org.apache.commons.lang.StringUtils;

public enum FsmEvenType {

    In("in"){
        @Override
        public FsmEven tran2InType(FsmEven fsmEven) {
            return fsmEven;
        }
    },Gt("gt"){
        @Override
        public FsmEven tran2InType(FsmEven fsmEven) {
            return null;
        }
    },Gtq("gtq"){
        @Override
        public FsmEven tran2InType(FsmEven fsmEven) {
            return null;
        }
    },Lt("lt"){
        @Override
        public FsmEven tran2InType(FsmEven fsmEven) {
            return null;
        }
    },Ltq("ltq"){
        @Override
        public FsmEven tran2InType(FsmEven fsmEven) {
            return null;
        }
    },Default(""){
        @Override
        public FsmEven tran2InType(FsmEven fsmEven) {
            return null;
        }
    };

    public static FsmEvenType getByName(String name) {
        if (StringUtils.isBlank(name)) {
            return Default;
        }
        for (FsmEvenType fsmEvenType : FsmEvenType.values()) {
            if (fsmEvenType.getName().equals(name)) {
                return fsmEvenType;
            }
        }
        return Default;
    }

    private String name;

    public String validate(FsmEven fsmEven) {
        return null;
    }
    public abstract FsmEven tran2InType(FsmEven fsmEven);

    FsmEvenType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
