package com.victory.erp.employee.mapper;

import com.victory.erp.employee.domain.Title;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TitleMapper {


    public Title findByTitleCode(@Param("code") String titleCode);

    public Title findByEmpTitle(@Param("empTitle") Integer empTitle);

/*
    @Insert("Insert Titles (empTitle,titleCode,titleName,level) into (#{empTitle},#{titleCode},#{titleName},#{level})")
    public int insertTitles(Titles titles);
    @Update("Update Titles set titleCode = #{titleCode},titleName = #{titleName},level = #{level} Where empTitle = #{empTitle}")
    public void updateTitle(Titles titles);

    @Delete("Delete from Titles Where empTitle = ${empTitle}")
    public void deleteTitle(@Param("empTitle") Integer empTitle);
*/
}
