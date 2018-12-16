package com.mosesc.vobscriptapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class VobObjMethods {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer objId;
    private String method;
    private String description;
}
