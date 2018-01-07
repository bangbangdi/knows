package com.yz.service.imple;

import com.yz.dao.ArticleMapper;
import com.yz.dao.ScanMapper;
import com.yz.dao.UserMapper;
import com.yz.model.Article;
import com.yz.model.User;
import com.yz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImple implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ScanMapper scanMapper;
    @Override
    public int selectByModel(String username, String password) {
        int i = userMapper.selectByModel(username,password);
        return i;
    }

    @Override
    public int insert(User record) {
        int i = 0;
        if(record.getUsername()==null){
            return i = 0;
        }else {
             i = userMapper.insert(record);
            return i;
        }
    }

    @Override
    public int insert(Article record) {
        int i = articleMapper.insert(record);
        return i;
    }

    @Override
    public User selectByName(String name) {
        User user = userMapper.selectByName(name);
        return user;
    }

    @Override
    public List<Article> getAllByUserId(Integer id) {
        List<Article> lists = articleMapper.getAllByUserId(id);
        return lists;
    }

    @Override
    public Article selectByPrimaryKey(Integer articleid) {
        Article article = articleMapper.selectByPrimaryKey(articleid);
        return article;
    }

    @Override
    public User selectByPrimaryKeyUser(Integer userid) {
        User user = userMapper.selectByPrimaryKey(userid);
        return user;
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        int i = articleMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int deleteByPrimaryKey(Integer articleid) {
        int i =articleMapper.deleteByPrimaryKey(articleid);
        return i;
    }

    @Override
    public int deleteByArticleId(Integer articleId) {
       int i = scanMapper.deleteByArticleId(articleId);
       return i;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        int i = userMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public List<Article> getArticleList(String articletypename, String conten) {
        List<Article> lists = articleMapper.getArticleList(articletypename,conten);
        return  lists;
    }


}
