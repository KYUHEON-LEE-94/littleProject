package lee.yorizori_mybatis.recipeProcedure.service;

import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipeProcedure.dto.ReciepeProcedure;
import lee.yorizori_mybatis.recipeProcedure.mapper.RecipeProcedureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecipeProcedureServiceImpl implements RecipeProcedureService {

    @Autowired
    private RecipeProcedureMapper mapper;

    @Override
    public void create(ReciepeProcedure reciepeProcedure) {
        mapper.create(reciepeProcedure);
    }
}
