package com.yz.dao;

import com.yz.model.ListAllInfo;
import com.yz.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);
    int insert(User record);
    ListAllInfo getSomeInfo();
    int insertSelective(User record);
    User selectByPrimaryKey(Integer userid);
    int updateByPrimaryKeySelective(User record);
    int updateByPrimaryKey(User record);
    int selectByModel(String username,String password);
    User selectByName(String name);
}