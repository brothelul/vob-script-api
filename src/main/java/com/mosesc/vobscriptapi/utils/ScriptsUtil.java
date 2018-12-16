package com.mosesc.vobscriptapi.utils;

import com.mosesc.vobscriptapi.bo.OutputComponentParamVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther mosesc
 * @date 12/14/18.
 */
public class ScriptsUtil {
    private static Pattern p2=Pattern.compile("#\\{\\s*(.*?)\\s*\\}");

    public static List<OutputComponentParamVo> initParams(String scripts){
        List<OutputComponentParamVo> paramVos = new ArrayList<>();
        Map<String, Object> tempContainer = new HashMap<>();
        Matcher matcher = p2.matcher(scripts);
        while(matcher.find()){
            String name=matcher.group(1);
            OutputComponentParamVo param = new OutputComponentParamVo();
            param.setName(name);
            Object returnValue = tempContainer.put(name, "tempValue");
            if (returnValue == null){
                paramVos.add(param);
            }
        }
        return paramVos;
    }
}
