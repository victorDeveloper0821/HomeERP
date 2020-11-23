package com.victory.erp.employee.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("titles")
@Getter
@Setter
public class Titles {
    private Integer empTitle;
    private String titleCode;
    private String titleName;
    private Integer level;
}
