package org.ygy.common.simplefsm;

import org.assertj.core.util.Lists;
import org.ygy.common.simplefsm.config.FsmConfig;
import org.ygy.common.simplefsm.event.FsmEvent;
import org.ygy.common.simplefsm.util.EduGsonUtils;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        FsmConfig fsmConfig = new FsmConfig();
        fsmConfig.setTableName("study_report");
        fsmConfig.setPkName("id");
        fsmConfig.setStateName("state");

        List<FsmEvent> fsmEvens = new ArrayList<>();
        FsmEvent fsmEven1 = new FsmEvent();
        fsmEven1.setAction("add");
        fsmEven1.setTarState("10");
        fsmEven1.setCurStates(Lists.newArrayList("0"));
        fsmEven1.setType("in");

        FsmEvent fsmEven2 = new FsmEvent();
        fsmEven2.setAction("submit");
        fsmEven2.setTarState("30");
        fsmEven2.setCurStates(Lists.newArrayList("0","10","20"));
        fsmEven2.setType("in");

        fsmEvens.add(fsmEven1);
        fsmEvens.add(fsmEven2);
        fsmConfig.setFsmEvens(fsmEvens);

        System.out.println(EduGsonUtils.toJson(fsmConfig));
    }


}
