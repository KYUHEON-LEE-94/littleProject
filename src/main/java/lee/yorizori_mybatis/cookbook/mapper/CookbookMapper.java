package lee.yorizori_mybatis.cookbook.mapper;

import lee.yorizori_mybatis.common.web.page.Params;
import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.dto.CookbookMainDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CookbookMapper {

    public void create(Cookbook cookbook);

    public int countCookbook();

    public List<Cookbook> findAllPaging(Params params);

    public List<Cookbook> finAllCookbooks();

    public List<CookbookMainDto> MainIndexList();

}
