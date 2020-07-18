package com.yan.basics.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class BasicsDict {
    private Integer id;
    private String dictKey;
    private String dictValue;
    private String typeGroup;
    private Integer status;
    private String remark;
    private String addUser;
    private Date addTime;
    private String updateUser;
    private Date updateTime;
}
