package lee.yorizori_mybatis.cookbook.service;

import lee.yorizori_mybatis.common.web.Params;
import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.mapper.CookbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookbookServiceImpl implements CookbookService {

    @Autowired
    CookbookMapper cookbookMapper;

    @Override
    public void create(Cookbook cookbook) {
        cookbookMapper.create(cookbook);
    }

    @Override
    public int countCookbook() {
        return cookbookMapper.countCookbook();
    }

    @Override
    public List<Cookbook> findAllPaging(Params params) {
        return cookbookMapper.findAllPaging(params);
    }

    @Override
    public List<Cookbook> finAllCookbooks() {
        return cookbookMapper.finAllCookbooks();
    }

    @Override
    public List<Cookbook> MainIndexList() {
        return cookbookMapper.MainIndexList();
    }
}
