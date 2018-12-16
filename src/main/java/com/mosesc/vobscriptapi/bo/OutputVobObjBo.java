package com.mosesc.vobscriptapi.bo;

import lombok.Data;

import java.util.List;

@Data
public class OutputVobObjBo {
    private String obj;
    private List<String> methods;
}
