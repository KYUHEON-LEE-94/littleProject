package lee.yorizori_mybatis.cookbook.dto;

import lombok.*;

/**
 * 조인한 목록들을 불러오기 위해서
 */
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class CookbookMainDto {
    private Integer bookId;
    private String id,bookName, bookDesc, authorId;

    private int receipeId, receipeTime, receipeLevel;
    private String receipeName, Ingredients, ImgContType, ImgFileName, WriterId;
}
