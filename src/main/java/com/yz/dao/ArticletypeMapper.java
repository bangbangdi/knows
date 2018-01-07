package com.yz.dao;

import com.yz.model.Articletype;

public interface ArticletypeMapper {
    int deleteByPrimaryKey(Integer articletypeid);

    int insert(Articletype record);

    int insertSelective(Articletype record);

    Articletype selectByPrimaryKey(Integer articletypeid);

    int updateByPrimaryKeySelective(Articletype record);

    int updateByPrimaryKey(Articletype record);
}