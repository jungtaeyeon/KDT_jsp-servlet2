package com.example.demo.pojo2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

// Restful API란 무엇인가??
// 전송방식 -> 바이너리 -> UI솔루션이 지원하는 모드중에 한가지
@SuppressWarnings("serial")
@WebServlet("*.gd2")
public class ActionServlet extends HttpServlet {
	Logger logger = Logger.getLogger(ActionServlet.class);
	
	protected void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String  uri = req.getRequestURI(); // => /notice/noticeInsert.gd?n_title=a&n_content=b
		logger.info(uri);
		String context = req.getContextPath();// /
		logger.info(context);
		String command = uri.substring(context.length()+1);//-> notice/noticeInsert.gd
		logger.info(command);
		//뒤에 의미없는 확장자 gd를 잘라내기
		int end = command.lastIndexOf(".");//점이 있는 위치정보를 가져온다
		logger.info(""+end);
		command =  command.substring(0,end);//-> notice/noticeInsert까지만 가져온다. .gd는 빼고서....
		logger.info(command);//-> notice/noticeList or notice/noticeInsert or notice/noticeUpdate or notice/noticeDelete
		String upmu[] = null;
		String result = null; // -> redirect:/board/boardInsert, forward:/board/boardList
		upmu = command.split("/");
		for(String name:upmu) {
			logger.info(name);
		}
		Controller controller = new BoardController();
		if("board".equals(upmu[0])) {
			logger.info("workname - board - execute호출");
			req.setAttribute("upmu",upmu);
			result = controller.execute(req, res);
		}
		// BoardController를 경유한 다음에 리턴값으로 문자열을 받았다.
		// 이 문자열을 잘라서 pageMove에 담아준다.
		
		// =========================== 작업지시서 ===========================
		// 먼저 null 체크하기
		// 문자열 배열을 선언할 것
		// : 이 포함되어 있니??
		// : 이 없는 경우도 처리할 것
		// 1) redirect-webapp - "redirect:/board/boardList.jsp"
		// 2)forward-webapp - "forward:/board/boardList.jsp"
		// 3) : 없는 경우 -> /WEB-INF/jsp/ - "/board/boardList.jsp"
		if(result != null) {
			String pageMove[] = null;
			if(result.contains(":")) {
				logger.info(":이 포함되어 있어요");
				pageMove = result.split(":"); // [0] = redirect or forward [1] = /board/boardList
			} /////// end of 콜론이 있는 경우
			// 콜론이 없는 경우 -> 
			else{
				pageMove = result.split("/"); // [0] = board [1] = boardList
				logger.info(pageMove);
			} /////// end of 콜론이 없는 경우
			logger.info(pageMove[0] + ", " + pageMove[1]);
			if(pageMove != null) {
				String path = pageMove[1]; // board/boardList
				if("redirect".equals(pageMove[0])) {
					res.sendRedirect("/" + path + ".gd2");
				} ////// end of sendRedirect인 경우
				else if("forward".equals(pageMove[0])) {
					RequestDispatcher view = req.getRequestDispatcher("/"+path+".jsp");
					view.forward(req, res);
				}  ////// end of forward인 경우
				else {
					path = pageMove[0] + "/" + pageMove[1]; // board/boardList
					RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/jsp/"+path+".jsp");
					view.forward(req, res);
				} // 배포 위치가 /WEB-INF/jsp/ 인 경우
			} //// pageMove 배열이 null이 아닌 경우
		} /////// end of if
	} ////////// end of doService
	
	// 삭제
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doService(req, res);
	}

	// 쿼리스트링으로 값을 넘길 때 - 링크, header, 제한적
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doService(req, res);
	}
	
	// body에 값을 넘길 때 - 서버인터셉트를 안당한다, 무조건 서버 전달, 제한이 없다 - 바이너리 타입도 담을 수 있다(첨부파일도 가능)
	// 첨부파일을 담을때는 무조건 post방식 이여야 한다. - enctype="multipart/form-data" - 바이너리로 전달(문자+숫자의 조합) - 이미지 포함 가능
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doService(req, res);
	}
	
	// 수정
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doService(req, res);
	}
}