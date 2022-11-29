package lee.yorizori_mybatis.cookbook.controller;

import lee.yorizori_mybatis.common.web.page.Page;
import lee.yorizori_mybatis.common.web.page.Params;
import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.service.CookbookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/cookbook/list.do")
public class CookbookListController {

    @Autowired
    CookbookServiceImpl cookbookService;

    @GetMapping
    public String doGet(@RequestParam(required = false, defaultValue = "") String type,
                        @RequestParam(required = false, defaultValue = "") String value,
                        @RequestParam(value ="size", required = false) String size,
                        @RequestParam(value="page", required = false) String selectPage,
                        Model model){


        /**
         * Default로 값을 정해놓는다.
         */
        //한페이지당 3개씩 보여주겠다.
        int pageSize = 3;
        //페이지 번호 5개씩~
        int pageCount = 3;
        //요청 페이지 - default값으로 1번째 페이지 보여주겠다.
        int requestPage = 1;


        //size != null라는 건, 사용자가 요청한 사이즈가 있다는 것. 그래서 pageSize값을 변경
        if (size != null) {
            pageSize = Integer.parseInt(size);
        }

        //몇번 페이지를 보여줄것이냐
        if (selectPage != null) {
            requestPage = Integer.parseInt(selectPage);
        }

        Params params = new Params(type, value, pageSize, pageCount, requestPage);
        model.addAttribute("params",params);



        List<Cookbook> list = cookbookService.findAllPaging(params);


        model.addAttribute("CookbookList", list);


        int count = cookbookService.countCookbook();
        model.addAttribute("count", count);;


        Page paging = new Page(params, count);
        paging.build();
        //JSP로 paging을 전달해서 paging처리할 수 있도록
        model.addAttribute("paging", paging);

        return "/views/cookbook/cookbookList";
    }
}
