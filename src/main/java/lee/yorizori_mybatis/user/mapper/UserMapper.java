package lee.yorizori_mybatis.user.mapper;


import lee.yorizori_mybatis.user.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 회원관련 데이터 처리 추상 메소드 선언
 * 
 * @author 이규헌
 */
@Mapper
public interface UserMapper {
	public void create(User user);

	public List<User> findAll();

	public User findById(String id);



	public User findByIdAndPasswd(@Param("id") String id, @Param("passwd") String passwd);



}
