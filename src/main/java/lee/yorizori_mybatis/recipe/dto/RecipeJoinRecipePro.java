package lee.yorizori_mybatis.recipe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class RecipeJoinRecipePro {
    private int receipeId, bookId, receipeTime, receipeLevel;
    private String receipeName, Ingredients, ImgContType, ImgFileName, WriterId;
    
	private int seqNum;
	private String procedure;

}
