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
@WebServlet("/mainsite/adobe.do")
public class adobeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 등록 화면 처리
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/MainSite/LinkAssets/어도브/adobe.jsp").forward(request, response);
		
	}



}









