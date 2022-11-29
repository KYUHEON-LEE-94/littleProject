package lee.yorizori_mybatis.recipeProcedure.dto;

import lombok.*;

/*
 * 사용자 정보 저장을 위한 자바 빈
 */
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class ReciepeProcedure {
	private int receipeId;
	private int seqNum;
	private String procedure;
}
