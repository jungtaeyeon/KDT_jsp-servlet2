package com.example.demo.pojo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
/*
 * 1-1에는 없는 XXXDao를 등판시켰다.
 * 왜냐하면 hibernate를 사용할 수도 있고, myBatis를 사용할 수도 있기 때문이다.
 * 공통분모가 되는 클래스를 분리해서 설계하는 것이 좋다.
 * 그 밖에는 트랜잭션 처리를 일괄적으로 설정처리 할 때도 유리하다.
 * 트랜잭션 처리는 XXXLogic에서 여러가지 XXXDao클래스의 메소드를 호출할 수 있기 때문에 
 * XXXLogic계층에서 AOP를 적용한 자동처리가 가능한 것 이다.
 */

import com.util.MyBatisCommonFactory;

public class BoardDao {
	Logger logger = Logger.getLogger(BoardDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	
	public BoardDao() {
		sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory();
	}

	public List<Map<String, Object>> boardList(Map<String, Object> pMap) {
		logger.info("boardList"); 
		List<Map<String,Object>> bList = new ArrayList<>();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {  
			bList = sqlSession.selectList("boardList", pMap);
			logger.info(bList.toString());
		} catch (Exception e) {
			logger.info(e.toString());
		}
		return bList;
	}

	public int boardInsert(Map<String, Object> pMap) {
		logger.info("boarInsert");
		int result = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			result = sqlSession.insert("boardInsert", pMap);			
			sqlSession.commit();//빼먹으면 물리적인테이블 반영안됨
		} catch (Exception e) {
			logger.info(e.toString());
		}
		return result;
	}

	public int boardUpdate(Map<String, Object> pMap) {
		logger.info("boardUpdate");
		int result = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			result = sqlSession.update("boardUpdate", pMap);			
			sqlSession.commit();//빼먹으면 물리적인테이블 반영안됨
		} catch (Exception e) {
			logger.info(e.toString());
		}
		return result;
	}

	public int boardDelete(Map<String, Object> pMap) {
		logger.info("boardDelete");
		int result = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			// board.xml에서 parameterType="int" 로 바꿨기 때문에 !
			int b_no = Integer.parseInt(pMap.get("b_no").toString());
			result = sqlSession.delete("boardDelete", b_no);	
			logger.info(result);
			
//			result = sqlSession.delete("boardDelete", pMap);			
			sqlSession.commit();//빼먹으면 물리적인테이블 반영안됨
		} catch (Exception e) {
			logger.info(e.toString());
		}
		return result;
	}
}
