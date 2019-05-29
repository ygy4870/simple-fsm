package org.ygy.common.simplefsm;

import java.util.List;

public class FsmConfig {

    private String tableName;
    private String pkName;
    private String stateName;
    private List<FsmEven> fsmEvens;

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

    public List<FsmEven> getFsmEvens() {
        return fsmEvens;
    }

    public void setFsmEvens(List<FsmEven> fsmEvens) {
        this.fsmEvens = fsmEvens;
    }
}
