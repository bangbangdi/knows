package com.yz.service;

import com.yz.model.Article;
import com.yz.model.User;

import java.util.List;

public interface UserService {
    int selectByModel(String username,String password);
    int insert(User record);
    int insert(Article record);
    User selectByName(String name);
    List<Article> getAllByUserId(Integer id);
    Article selectByPrimaryKey(Integer articleid);
    User selectByPrimaryKeyUser(Integer userid);
    int updateByPrimaryKeySelective(Article record);
    int deleteByPrimaryKey(Integer articleid);
    int deleteByArticleId(Integer articleId );
    int updateByPrimaryKeySelective(User record);
    List<Article> getArticleList(String articletypename,String conten);
}
