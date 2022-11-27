package lee.yorizori_mybatis.cookbook.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Cookbook {
	private Integer bookId;
	private String bookName, bookDesc, authorId;

	
	
}
