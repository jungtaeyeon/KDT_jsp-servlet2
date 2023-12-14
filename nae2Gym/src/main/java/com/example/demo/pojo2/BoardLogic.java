package com.example.demo.pojo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

// 나는 Controller라는 인터페이스를 상속받지(implements) 않아서 
// 어떠한 제약조건(추상메소드-execute(req,res) -> 톰캣제공 - 단 서블릿 이여야 한다. -> 그런데 서블릿이 아니여도 스프링은 지원해준다.)도 해당 안된다.
// 즉 나는 순수한 자바 클래스 이다. (순수성 - 원자성 - 다른 이종간에 결합에서 사용이 가능한 상태라는 장점이 있다.)
public class BoardLogic {
	Logger logger = Logger.getLogger(BoardLogic.class);
	BoardDao bDao = new BoardDao();
	public List<Map<String, Object>> boardList(Map<String, Object> pMap) {
		logger.info("boardList");
		// 웹개발에서는 NullPointerException이 발동하면 화면 자체가 안열림 -막막함
		// 어떤 힌트를 보고 문제를 예측해서 하나씩 가능성을 제거해 나가는 과정을 통해서 트러블 슈팅을 완성함
		List<Map<String, Object>> bList = new ArrayList<>(); // NullPointerException방어코드로 ArrayList 넣어놓기
		bList = bDao.boardList(pMap);
		return bList;
	}

	public int boardInsert(Map<String, Object> pMap) {
		logger.info("boardInsert");
		int result = 0;
		result = bDao.boardInsert(pMap);
		return result;
	}

	public int boardUpdate(Map<String, Object> pMap) {
		logger.info("boardUpdate");
		int result = 0;
		result = bDao.boardUpdate(pMap);
		return result;
	}

	public int boardDelete(Map<String, Object> pMap) {
		logger.info("boardDelete");
		int result = 0;
		result = bDao.boardDelete(pMap);
		return result;
	}

}
