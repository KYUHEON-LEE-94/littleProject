package lee.yorizori_mybatis.cookbook.controller;


import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.service.CookbookServiceImpl;
import lee.yorizori_mybatis.user.dto.User;
import lee.yorizori_mybatis.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class CookbookMain {

    @Autowired
    private CookbookServiceImpl service;

    @GetMapping("/")
    public String mainIndex(Model model){
        List<Cookbook> list = service.finAllCookbooks();
        model.addAttribute("list",list);
        return "/views/includes/indexContents";
    }
}
