package namoo.yorizori.mainsite.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import namoo.yorizori.common.factory.ServiceFactoryImpl;
import namoo.yorizori.common.web.Page;
import namoo.yorizori.common.web.Params;
import namoo.yorizori.user.dto.User;
import namoo.yorizori.user.service.UserService;

/**
 * 요리책 등록 화면 및 등록 처리 서블릿 컨트롤러
 */
@WebServlet("/mainsite/memberlist.do")
public class MemberListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 등록 화면 처리
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		if (type == null) {
			type = "";
		}
		
		String value = request.getParameter("value");
		if (value == null) {
			value = "";
		}
		
		UserService userService = ServiceFactoryImpl.getInstance().getUserService();
		
		// 페이징 처리를 위해 필요한 정보
		// 전체검색개수, 한페이당 보여지는 목록 개수, 한 페이지당 보여지는 페이지 개수

		/**
		 * Default로 값을 정해놓는다.
		 */
		//한페이지당 3개씩 보여주겠다.
		int pageSize = 4;
		//페이지 번호 5개씩~
		int pageCount = 5;
		//요청 페이지 - default값으로 1번째 페이지 보여주겠다.
		int requestPage = 1;
		
		
		String size = request.getParameter("size");
		
		//size != null라는 건, 사용자가 요청한 사이즈가 있다는 것. 그래서 pageSize값을 변경
		if (size != null) {
			pageSize = Integer.parseInt(size);
		}
		
		//몇번 페이지를 보여줄것이냐
		String selectPage = request.getParameter("page");
		if (selectPage != null) {
			requestPage = Integer.parseInt(selectPage);
		}
		
		Params params = new Params(type, value, pageSize, pageCount, requestPage);
		List<User> list = userService.search(params);
		//전체목록을 JSP에 보여주기위해 set함
		request.setAttribute("list", list);
		
		//전체 개수를 확인하기 위해서
		int count = userService.searchCount(type, value);
		//전체 개수를 JSP에서 보여주기 위해서 set함
		request.setAttribute("count", count);
		Page paging = new Page(params, count);
		request.setAttribute("paging", paging);
		paging.build();
		

		
		request.getRequestDispatcher("/WEB-INF/MainSite/user/list.jsp").forward(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}



}









