package top.wservice.mapper;

import org.apache.ibatis.annotations.Param;
import top.wservice.entity.Userm;
import top.wservice.entity.UsermExample;

import java.util.List;

public interface UsermMapper {
    int countByExample(UsermExample example);

    int deleteByExample(UsermExample example);

    int insert(Userm record);

    int insertSelective(Userm record);

    List<Userm> selectByExample(UsermExample example);

    int updateByExampleSelective(@Param("record") Userm record, @Param("example") UsermExample example);

    int updateByExample(@Param("record") Userm record, @Param("example") UsermExample example);
}