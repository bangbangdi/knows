package com.yz.controller;

import com.yz.model.Article;
import com.yz.model.ListAllInfo;
import com.yz.model.User;
import com.yz.service.AllInfoService;
import com.yz.service.UserService;
import com.yz.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("userAction")
public class UserAction {
    @Autowired
    private AllInfoService allInfoService;
    @Autowired
    private UserService userService;
    private User user;
    private Article article;

    @RequestMapping("toLoginPage")
    public ModelAndView toLoginPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/login");
        return mv;
    }

    @RequestMapping("login")
    public ModelAndView toLogin(User user, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        int i = userService.selectByModel(user.getUsername(), user.getPassword());
        if (i > 0) {
            session.setAttribute("username", user.getUsername());
            List<ListAllInfo> lists = allInfoService.getSomeInfo();
            mv.addObject("lists", lists);
            mv.addObject("username", user.getUsername());
            mv.setViewName("article/forum");
        } else {
            mv.setViewName("user/register");
        }
        return mv;
    }

    @RequestMapping("register")
    public ModelAndView toRegist(User user) {
        ModelAndView mv = new ModelAndView();
        user.setRegistertime(DateUtils.strToDateLong(DateUtils.getStringDate()));
        int i = userService.insert(user);
        if (i > 0) {
            mv.setViewName("success");
        } else {
            mv.setViewName("user/register");
        }
        return mv;
    }

    @RequestMapping("toAddArticlePage")
    public ModelAndView toAddArticlePage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("article/addArticle");
        return mv;
    }

    @RequestMapping("addArticle")
    public ModelAndView addArticle(Article article, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        String username = (String) session.getAttribute("username");
        User user = userService.selectByName(username);
        article.setEmittime(DateUtils.strToDateLong(DateUtils.getStringDate()));
        article.setUserid(user.getUserid());
        int i = userService.insert(article);
        if (i > 0) {
            mv.addObject("username", user.getUsername());
            List<Article> lists = userService.getAllByUserId(user.getUserid());
            mv.addObject("lists", lists);
            mv.setViewName("article/userArticles");
        } else {
            mv.setViewName("article/addArticle");
        }
        return mv;
    }

    @RequestMapping("singleArticle*")
    public ModelAndView singleArticle(@RequestParam Integer id, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        Article article = userService.selectByPrimaryKey(id);
        User user = userService.selectByPrimaryKeyUser(article.getUserid());
        session.setAttribute("article", article);
        List<ListAllInfo> lists = allInfoService.getSomeInfo();
        mv.addObject("lists", lists);
        mv.addObject("user", user);
        mv.addObject("article", article);
        mv.setViewName("article/singleArticle");
        return mv;
    }

    @RequestMapping("updateArticle")
    public ModelAndView updateArticle(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        Article article = (Article) session.getAttribute("article");
        mv.addObject("article", article);
        mv.setViewName("article/updateArticle");
        return mv;
    }

    @RequestMapping("updateArticle1*")
    public ModelAndView updateArticle1(Article article, @RequestParam Integer id) {
        article.setArticleid(id);
        int i = userService.updateByPrimaryKeySelective(article);
        System.out.println(i);
        return new ModelAndView("redirect:singleArticle?id=" + id);
    }

    @RequestMapping("deleteArticle*")
    public ModelAndView deleteArticle(@RequestParam Integer id) {
        ModelAndView mv = new ModelAndView();
        userService.deleteByArticleId(id);
        userService.deleteByPrimaryKey(id);
        mv.setViewName("article/userArticles");
        return mv;
    }

    @RequestMapping("myArticle")
    public ModelAndView myArticle(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        String username = (String) session.getAttribute("username");
        User user = userService.selectByName(username);
        mv.addObject("username", user.getUsername());
        List<Article> lists = userService.getAllByUserId(user.getUserid());
        mv.addObject("lists", lists);
        mv.setViewName("article/userArticles");
        return mv;
    }

    @RequestMapping("update")
    public ModelAndView update(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        String username = (String) session.getAttribute("username");

        User user = userService.selectByName(username);
        session.setAttribute("id", user.getUserid());
        mv.addObject("user", user);
        mv.setViewName("user/update");
        return mv;
    }

    @RequestMapping("updateUser")
    public ModelAndView updateUser(User user, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        Integer id = (Integer) session.getAttribute("id");
        user.setUserid(id);
        int i = userService.updateByPrimaryKeySelective(user);
        mv.setViewName("user/success");
        mv.addObject("msg", "恭喜您，修改成功！");
        return mv;
    }

    @RequestMapping("index")
    public ModelAndView index(HttpSession session) {
        session.invalidate();
        return new ModelAndView("redirect:/index.jsp");
    }

    @RequestMapping("forum")
    public ModelAndView forum(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        String username = (String) session.getAttribute("username");
        List<ListAllInfo> lists = allInfoService.getSomeInfo();
        mv.addObject("lists", lists);
        mv.addObject("username", username);
        mv.setViewName("article/forum");
        return mv;
    }

    @RequestMapping("doSearch")
    public ModelAndView doSearch(String content, String articletypename, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        String username = (String) session.getAttribute("username");
        mv.addObject("username", username);
        List<Article> lists = userService.getArticleList(articletypename, content);
        mv.addObject("lists", lists);
        mv.setViewName("article/searchResult");
        return mv;
    }
}
