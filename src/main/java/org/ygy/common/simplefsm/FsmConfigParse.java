package org.ygy.common.simplefsm;

import com.mchange.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.ygy.common.simplefsm.util.EduGsonUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FsmConfigParse {

    public FsmConfig parse(String path) {
        String json = null;
        try {
            json = FileUtils.getContentsAsString(new File(path));
        } catch (IOException e) {
            //
        }
        if (StringUtils.isBlank(json)) {
            return new FsmConfig();
        }

        return EduGsonUtils.fromJson(json, FsmConfig.class);
    }

    private String valide(FsmConfig fsmConfig) {
        if (null==fsmConfig) {
            return "fsmConfig is null";
        }
        if (StringUtils.isBlank(fsmConfig.getTableName())) {

        }
        if (StringUtils.isBlank(fsmConfig.getPkName())) {

        }
        if (StringUtils.isBlank(fsmConfig.getStateName())) {

        }
        if (null == fsmConfig.getStates() || fsmConfig.getStates().size() < 1) {

        }
        if (null == fsmConfig.getFsmEvens() || fsmConfig.getFsmEvens().size() < 1) {

        }
        this.tran2In(fsmConfig);
        return null;
    }

    private void tran2In(FsmConfig fsmConfig) {
        List<FsmEven> fsmEvens = new ArrayList<>();
        for (FsmEven fsmEven : fsmConfig.getFsmEvens()) {
            fsmEvens.add(FsmEvenType.getByName(fsmEven.getType()).tran2InType(fsmEven));
        }
        fsmConfig.setFsmEvens(fsmEvens);
    }

}
