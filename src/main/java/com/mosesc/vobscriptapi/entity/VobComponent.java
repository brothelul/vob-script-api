package com.mosesc.vobscriptapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @auther mosesc
 * @date 12/14/18.
 */
@Data
public class VobComponent {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private String content;
}
