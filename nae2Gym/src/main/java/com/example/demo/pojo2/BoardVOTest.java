package com.example.demo.pojo2;

import com.vo.BoardVO;
import com.vo.EmpVO;
// VO패턴은 객체와 테이블 사이의 매핑을 위해 시작된 클래스 설계 이였다.
// 자바에서는 String인데 오라클에서는 Char, Varchar2 - 타입이 다르다, 실제 값은 동일한 타입이다.
public class BoardVOTest {

	public static void main(String[] args) {
		// lombok 미적용
		EmpVO evo = new EmpVO(3); // public EmpVO(int empno)가 있어서 가능하다.
//		EmpVO evo = new EmpVO(3, "나잘난"); // public EmpVO(int empno, String ename) 없어서 불가능...
		
		// lombok 적용
//		BoardVO bvo = new BoardVO(5);
		BoardVO bvo = BoardVO.builder().b_no(3).build();
		// 순서 상관 없이 사용 가능하다!
		BoardVO bvo2 = BoardVO.builder().b_no(3).b_title("제목").b_date("2023-10-10").build();
	
		String date = bvo2.getB_date();
		System.out.println(date); // 2023-10-10
		System.out.println(bvo2.getB_title()); // 제목
		System.out.println("===============================");
		
		BoardVO bvo3 = new BoardVO();
		bvo3.setB_title("제목33");
		String title = bvo3.getB_title();
		System.out.println(title); // 제목33	
		System.out.println(bvo3.getB_date()); // null
	}

}
