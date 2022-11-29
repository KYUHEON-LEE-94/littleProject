package lee.yorizori_mybatis.common.web.page;

import lombok.*;

/**
 * 여러개의 요청파라메터들을 포장하기 위한 JavaBean
 * @author 김기정
 */
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Params {
	private String searchType;   /** 검색 유형 */
	private String searchValue;  /** 검색 값 */
	private int pageSize;        /** 페이지에 보여지는 목록 개수 */
	private int pageCount;       /** 페이지에 보여지는 페이지 개수 */
	private int requestPage;     /** 사용자 요청 페이지 */

	
}
