package lee.yorizori_mybatis.user.service;

import java.util.List;

import lee.yorizori_mybatis.user.dto.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 회원 관리 비즈니스 메서드 선언
 * 고객 요구사항 명세
 * @author Lee KyuHeon
 *
 */
@Mapper
public interface UserService {
	public void create(User user);
	public List<User> findAll();
	public User findById(String id);
	public User findByIdAndPasswd(String id, String passwd);

}
