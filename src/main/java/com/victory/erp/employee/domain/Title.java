package com.victory.erp.employee.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("titles")
@Getter
@Setter
public class Title {
    private Integer Tid;
    private String code;
    private String name;
    private Integer level;

    @Override
    public String toString() {
        return "Titles{" +
                "empTitle=" + Tid +
                ", titleCode='" + code + '\'' +
                ", titleName='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
