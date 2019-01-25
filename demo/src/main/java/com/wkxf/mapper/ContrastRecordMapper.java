package com.wkxf.mapper;

import com.wkxf.pojo.ContrastRecord;
import com.wkxf.pojo.ContrastRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContrastRecordMapper {
    long countByExample(ContrastRecordExample example);

    int deleteByExample(ContrastRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContrastRecord record);

    int insertSelective(ContrastRecord record);

    List<ContrastRecord> selectByExampleWithBLOBs(ContrastRecordExample example);

    List<ContrastRecord> selectByExample(ContrastRecordExample example);

    ContrastRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContrastRecord record, @Param("example") ContrastRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ContrastRecord record, @Param("example") ContrastRecordExample example);

    int updateByExample(@Param("record") ContrastRecord record, @Param("example") ContrastRecordExample example);

    int updateByPrimaryKeySelective(ContrastRecord record);

    int updateByPrimaryKeyWithBLOBs(ContrastRecord record);

    int updateByPrimaryKey(ContrastRecord record);
}