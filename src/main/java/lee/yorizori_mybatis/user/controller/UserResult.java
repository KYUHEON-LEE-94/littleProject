package lee.yorizori_mybatis.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/result.do")
public class UserResult {

    @GetMapping
    public String doGet(){
        return "/views/user/result";
    }
}
