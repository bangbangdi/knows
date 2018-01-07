package com.yz.dao;

import com.yz.model.Scan;

public interface ScanMapper {
    int deleteByPrimaryKey(Integer scanid);
    int deleteByArticleId(Integer articleId );
    int insert(Scan record);

    int insertSelective(Scan record);

    Scan selectByPrimaryKey(Integer scanid);

    int updateByPrimaryKeySelective(Scan record);

    int updateByPrimaryKey(Scan record);
}