package com.mosesc.vobscriptapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class VobObj {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String description;
}