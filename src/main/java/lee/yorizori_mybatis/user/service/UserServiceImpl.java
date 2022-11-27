package lee.yorizori_mybatis.user.service;

import lee.yorizori_mybatis.user.dto.User;
import lee.yorizori_mybatis.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void create(User user) {
        userMapper.create(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByIdAndPasswd(String id, String passwd) {
        return userMapper.findByIdAndPasswd(id, passwd);
    }

}
