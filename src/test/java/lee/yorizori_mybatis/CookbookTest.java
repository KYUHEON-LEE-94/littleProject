package lee.yorizori_mybatis;


import lee.yorizori_mybatis.common.web.page.Params;
import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.dto.CookbookMainDto;
import lee.yorizori_mybatis.cookbook.mapper.CookbookMapper;
import lee.yorizori_mybatis.cookbook.service.CookbookServiceImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class CookbookTest {

    @Autowired
    private CookbookServiceImpl cookbookService;
    @Autowired
    private CookbookMapper mapper;


    @Test
    @Disabled
    void create() {
        Cookbook cookbook = new Cookbook();
        cookbook.setAuthorId("xman0922");
        cookbook.setBookDesc("설명");
        cookbook.setBookName("책이름");
        cookbookService.create(cookbook);
    }

    @Test
    @Disabled
    void finAllCookbooks() {
        List<Cookbook> list = cookbookService.finAllCookbooks();
        System.out.println(list);
    }

    @Test
    @Disabled
    void findById() {
        List<CookbookMainDto> list = cookbookService.MainIndexList();
        System.out.println(list);
    }

    @Test
    @Disabled
    void countBySearchOption() {
        int s = cookbookService.countCookbook();
        System.out.println(s);
    }

    @Test
    @Disabled
    void findByIdAndPasswd() {
        String type = "";
        String value = "";
        int pageSize = 3;
        int pageCount = 3;
        int requestPage = 1;

        Params params = new Params(type, value, pageSize, pageCount, requestPage);
        List<Cookbook> list = cookbookService.findAllPaging(params);
        System.out.println(list);
    }





}
