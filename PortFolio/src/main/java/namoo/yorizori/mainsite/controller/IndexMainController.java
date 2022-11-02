package namoo.yorizori.mainsite.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import namoo.yorizori.common.factory.ServiceFactoryImpl;
import namoo.yorizori.cookbook.dto.Cookbook;
import namoo.yorizori.cookbook.service.CookbookService;

/**
 * 요리책 등록 화면 및 등록 처리 서블릿 컨트롤러
 */
@WebServlet("/Mainsite/index.do")
public class IndexMainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 등록 화면 처리
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		
		CookbookService service = ServiceFactoryImpl.getInstance().getCookbookService();
		List<Cookbook> list = service.findAllCookbooks();

		request.setAttribute("CookbookList", list);

		
		request.getRequestDispatcher("/WEB-INF/MainSite/index.jsp").forward(request, response);
		
	}


}









