package lee.yorizori_mybatis;


import lee.yorizori_mybatis.user.dto.User;
import lee.yorizori_mybatis.user.mapper.UserMapper;
import lee.yorizori_mybatis.user.service.UserServiceImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserTest {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    void findByAllTest() {
        List<User> list =userMapper.findAll();
    System.out.println(list);
    }

    @Test
    @Disabled
    void findById() {
        User user =userService.findById("xman0922");
        System.out.println(user);
    }

    @Test
    @Disabled
    void create() {
        User user = new User();
        user.setEmail("fsef@fefsa");
        user.setId("fffeee");
        user.setName("ddss");
        user.setPasswd("1111");
        userService.create(user);

    }

    @Test
    @Disabled
    void findByIdAndPasswd() {
        User user =userService.findByIdAndPasswd("xman0922","1111");
        System.out.println(user);

    }


}
