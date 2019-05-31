package org.ygy.common.simplefsm;

public enum FsmType {

    Sql("sql","流程会操作sql"),Memery("memery","流程判定在内存，是否改sql由实现者决定");

    private String name;
    private String desc;

    FsmType(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
