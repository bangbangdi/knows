package com.yz.controller;

import com.yz.model.Article;
import com.yz.model.ListAllInfo;
import com.yz.model.User;
import com.yz.service.AllInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("articleAction")
public class ArticleAction {
    @Autowired
   private AllInfoService allInfoService;
    @RequestMapping("forum")
    public ModelAndView forum(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        List<ListAllInfo> lists = allInfoService.getSomeInfo();
        mv.addObject("lists", lists);
        mv.setViewName("article/forum");
        return mv;
    }
    @RequestMapping("index")
    public ModelAndView index(){
        return new ModelAndView("redirect:/index.jsp");
    }


}
