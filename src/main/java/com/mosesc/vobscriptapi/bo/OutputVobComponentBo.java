package com.mosesc.vobscriptapi.bo;

import lombok.Data;

import java.util.List;

/**
 * @auther mosesc
 * @date 12/14/18.
 */
@Data
public class OutputVobComponentBo {
    private Integer id;
    private String name;
    private String description;
    private String content;
    private List<OutputComponentParamVo> params;
}
