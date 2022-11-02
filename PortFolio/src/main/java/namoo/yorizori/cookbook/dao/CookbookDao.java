package namoo.yorizori.cookbook.dao;

import java.util.List;
import java.util.Map;

import namoo.yorizori.common.web.Params;
import namoo.yorizori.cookbook.dto.Cookbook;
import namoo.yorizori.user.dto.User;

public interface CookbookDao {
	public void create(Cookbook cookbook) throws RuntimeException;
	public List<Cookbook> findAll() throws RuntimeException;
	public Cookbook  findCookbook(int bookId) throws RuntimeException;
	public List<Map<String, Object>> finAllCookbooksWithName() throws RuntimeException;
	public int countBySearchOption(String type, String value);
	public List<Map<String, Object>> findAllBySearchOption(Params params);
	
	//mainIndex에서의 인기순 리스트를 위한 메서드
	public List<Map<String, Object>> MainIndexList () throws RuntimeException;
}
