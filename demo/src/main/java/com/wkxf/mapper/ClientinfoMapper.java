package com.wkxf.mapper;

import com.wkxf.pojo.Clientinfo;
import com.wkxf.pojo.ClientinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientinfoMapper {
    long countByExample(ClientinfoExample example);

    int deleteByExample(ClientinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clientinfo record);

    int insertSelective(Clientinfo record);

    List<Clientinfo> selectByExampleWithBLOBs(ClientinfoExample example);

    List<Clientinfo> selectByExample(ClientinfoExample example);

    Clientinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clientinfo record, @Param("example") ClientinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Clientinfo record, @Param("example") ClientinfoExample example);

    int updateByExample(@Param("record") Clientinfo record, @Param("example") ClientinfoExample example);

    int updateByPrimaryKeySelective(Clientinfo record);

    int updateByPrimaryKeyWithBLOBs(Clientinfo record);

    int updateByPrimaryKey(Clientinfo record);
}