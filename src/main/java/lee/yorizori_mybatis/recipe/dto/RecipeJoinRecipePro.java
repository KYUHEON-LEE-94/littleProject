package lee.yorizori_mybatis.recipe.dto;


import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
/*
Reciper Join RecipeProcedure 결과를 받기위한 Bean
 */
public class RecipeJoinRecipePro {
    //Recipe
    private int receipeId, bookId, receipeTime, receipeLevel;
    private String receipeName, Ingredients, ImgContType, WriterId;
    MultipartFile ImgFileName;
    //RecipeProcedure
    private int seqNum;
    private String procedure;
}
