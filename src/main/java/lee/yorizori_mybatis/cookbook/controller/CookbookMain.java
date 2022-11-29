package lee.yorizori_mybatis.cookbook.controller;


import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.dto.CookbookMainDto;
import lee.yorizori_mybatis.cookbook.service.CookbookServiceImpl;
import lee.yorizori_mybatis.user.dto.User;
import lee.yorizori_mybatis.user.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
@Slf4j
@Controller
public class CookbookMain {

    @Autowired
    private CookbookServiceImpl service;

    @GetMapping("/")
    public String mainIndex(Model model){
        List<CookbookMainDto> list = service.MainIndexList();
        model.addAttribute("list",list);
        return "/views/includes/indexContents";
    }
}
