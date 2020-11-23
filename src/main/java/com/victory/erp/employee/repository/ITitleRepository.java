package com.victory.erp.employee.repository;

import com.victory.erp.employee.domain.Titles;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ITitleRepository {

    @Select("Select * from Tieles Where titleCode = #{titleCode}")
    public Titles findByTitleCode(@Param("titleCode") String titleCode);

    @Select("Select * from Tieles Where empTitle = #{empTitle}")
    public Titles findByEmpTitle(@Param("empTitle") Integer empTitle);

    @Insert("Insert Titles (empTitle,titleCode,titleName,level) into (#{empTitle},#{titleCode},#{titleName},#{level})")
    public int insertTitles(Titles titles);
    @Update("Update Titles set titleCode = #{titleCode},titleName = #{titleName},level = #{level} Where empTitle = #{empTitle}")
    public void updateTitle(Titles titles);

    @Delete("Delete from Titles Where empTitle = ${empTitle}")
    public void deleteTitle(@Param("empTitle") Integer empTitle);
}
