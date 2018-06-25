package cn.yh.springmvc.mapper;

import cn.yh.springmvc.pojo.Midder;
import cn.yh.springmvc.pojo.MidderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MidderMapper {
    int countByExample(MidderExample example);

    int deleteByExample(MidderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Midder record);

    int insertSelective(Midder record);

    List<Midder> selectByExample(MidderExample example);

    Midder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Midder record, @Param("example") MidderExample example);

    int updateByExample(@Param("record") Midder record, @Param("example") MidderExample example);

    int updateByPrimaryKeySelective(Midder record);

    int updateByPrimaryKey(Midder record);
}