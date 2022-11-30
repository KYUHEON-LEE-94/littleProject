package lee.yorizori_mybatis.user.controller;



import lee.yorizori_mybatis.user.dto.User;
import lee.yorizori_mybatis.user.service.UserServiceImpl;
import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/user/login.do")
    public String getLogOut(HttpServletRequest request, HttpServletResponse response, RedirectAttributes redirect) {
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                // 쿠키의 이름을 가져와서 비교한다.
                String name = cookie.getName();
                if (name.equalsIgnoreCase("loginid")) {
                    cookie.setPath("/");
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);

                }
                if (name.equalsIgnoreCase("saveid")) {
                    redirect.addAttribute("saveid",cookie.getValue());

                }
            }

        }
        return "redirect:/";
    }

    @PostMapping("/user/login.do")
    public String Login(@RequestParam("id") String id,
                        @RequestParam("passwd") String passwd,
                        @RequestParam("saveid") String saveid,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        RedirectAttributes redirect,
                        Model model
                        ){

        User loginUser = userService.findByIdAndPasswd(id,passwd);


        if (loginUser != null) {
            Cookie loginCookie = new Cookie("loginid", loginUser.getId());
            loginCookie.setPath("/");
            response.addCookie(loginCookie);
            redirect.addAttribute("loginid",loginUser.getId());
            redirect.addAttribute("loginStat", true);

            if (saveid != null) {
                Cookie saveidCookie = new Cookie("saveid", loginUser.getId());
                saveidCookie.setPath("/");
                saveidCookie.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(saveidCookie);


            }


            return "redirect:/";
        } else {
            // 회원가입이 안되어있으면 로그인 화면으로 다시 유도
            return  "redirect:/user/loginform.do";
        }



    }


}
