package com.bw.mapper;

import com.bw.bean.Types;
import java.util.List;

public interface TypesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Types record);
    

    Types selectByPrimaryKey(Integer id);

    List<Types> selectAll();

    int updateByPrimaryKey(Types record);
}