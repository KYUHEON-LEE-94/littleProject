package lee.yorizori_mybatis.recipe.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Recipe {

    private int receipeId, bookId, receipeTime, receipeLevel;
    private String receipeName, Ingredients, ImgContType, ImgFileName, WriterId;
}
