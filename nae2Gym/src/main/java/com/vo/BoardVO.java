package com.vo;
// JDBC API -> myBatis(ORM매핑오픈소스-if문지원-동적쿼리를 지원함-SQL문필요) -> Hibernate(ORM프레임워크 - SQL문이 없다 - 그런데 조회가 된다!)
// JPA - 마지막 목표 - 좋다 나쁘다 문제가 아님 - 당단점이 분명하다 - 튜닝이 안된다. 복잡한 계산식은 SQL문을 사용하는게 유리하다.
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// 왜 lombok을 사용할까?
// getter, setter 메소드를 추가하지 않아도 괜찮다.
// 전역변수를 private로 선언하였다. - 캡슐레이션 - 고유한 정보들은 외부에서 직접 수정하는걸 막는다.
// 그럼 그 변수에 직접 접근이 안된다

@Data // @Getter + @Setter
@NoArgsConstructor
public class BoardVO {
	private int 	b_no 		= 0;
	private String 	b_title 	= null;
	private String 	b_writer 	= null;
	private String 	b_content 	= null;
	private int 	b_hit 		= 0;
	private String 	b_date 		= null;
	private String 	b_file 		= null;
	
	// lombok에서 제공하는 @Builder를 사용하면 파라미터 갯수나 타입을 일일이 맞추지 않고도 자유롭게 사용이 가능하다.
	// 사용이란 생성자의 파라미터 값을 통한 전역변수들의 초기화 작업
	@Builder
	public BoardVO(int b_no, String b_title, String b_writer, String b_content, int b_hit, String b_date, String b_file) {
		super(); // 디플토 생성자 호출 - 왜냐면 파라미터를 갖는 생성자가 하나라도 있으면 디폴트 생성자를 제공하지 않음
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_writer = b_writer;
		this.b_content = b_content;
		this.b_hit = b_hit;
		this.b_date = b_date;
		this.b_file = b_file;
	}
}
