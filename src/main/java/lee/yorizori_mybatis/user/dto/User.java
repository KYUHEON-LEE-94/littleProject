package lee.yorizori_mybatis.user.dto;

import lombok.*;

/*
 * 사용자 정보 저장을 위한 자바 빈
 */
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	private String id, name, passwd, email, regdate;

	
}
