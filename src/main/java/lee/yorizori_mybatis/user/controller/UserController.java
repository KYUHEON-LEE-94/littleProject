package lee.yorizori_mybatis.user.controller;

import lee.yorizori_mybatis.user.dto.User;
import lee.yorizori_mybatis.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user/regist.do")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public String doGet(){
        return "/views/user/form";
    }

    @PostMapping
    public String doPost(@ModelAttribute User user,  RedirectAttributes redirect){

        userService.create(user);

        redirect.addAttribute("id", user.getId());
        redirect.addAttribute("name", user.getName());
        redirect.addAttribute("email", user.getEmail());

        return "redirect:/user/result.do";

    }

}
