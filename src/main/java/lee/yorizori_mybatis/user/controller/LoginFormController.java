package lee.yorizori_mybatis.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFormController {

    @GetMapping("/user/loginform.do")
    public String loginForm(){
        return "/views/user/login";
    }
}
