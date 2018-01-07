package com.yz.dao;

import com.yz.model.Article;
import com.yz.model.ListAllInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer articleid);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer articleid);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<ListAllInfo> getSomeInfo();
    List<Article> getAllByUserId(Integer id);
    List<Article> getArticleList(@Param("articletypename") String articletypename, @Param("content") String content);
}