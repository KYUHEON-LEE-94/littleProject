package lee.yorizori_mybatis.cookbook.service;

import lee.yorizori_mybatis.common.web.Params;
import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.user.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 회원 관리 비즈니스 메서드 선언
 * 고객 요구사항 명세
 * @author Lee KyuHeon
 *
 */
@Mapper
public interface CookbookService {
	public void create(Cookbook cookbook);

	public int countCookbook();

	public List<Cookbook> findAllPaging(Params params);

	public List<Cookbook> finAllCookbooks();

	public List<Cookbook> MainIndexList();

}
