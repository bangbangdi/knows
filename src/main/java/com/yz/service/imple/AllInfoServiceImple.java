package com.yz.service.imple;

import com.yz.dao.ArticleMapper;
import com.yz.model.ListAllInfo;
import com.yz.service.AllInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AllInfoServiceImple implements AllInfoService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<ListAllInfo> getSomeInfo() {
        List<ListAllInfo> lists = articleMapper.getSomeInfo();
        return lists;
    }
}
