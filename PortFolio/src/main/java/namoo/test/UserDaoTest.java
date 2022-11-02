package namoo.test;

import java.util.List;
import java.util.Map;

import namoo.yorizori.common.factory.ServiceFactory;
import namoo.yorizori.common.factory.ServiceFactoryImpl;
import namoo.yorizori.common.web.Params;
import namoo.yorizori.cookbook.service.CookbookService;
import namoo.yorizori.receipe.dto.Reciepe;

public class UserDaoTest {

	public static void main(String[] args) {
ServiceFactory serviceFactory = ServiceFactoryImpl.getInstance();
		CookbookService userService = serviceFactory.getReceipeProcedureService();
		
		/*
		 * CookbookService service =
		 * ServiceFactoryImpl.getInstance().getCookbookService();
		 * System.out.println(service.findCookbook(1));
		 */
		 

		List<Map<String, Object>> RecipeAll = userService.findRecipeContents(25);
		System.out.println(RecipeAll);

//		System.out.println(userService);
//		User user = new User();
//		user.setId("sylee");
//		user.setName("이승엽");
//		user.setPasswd("1111");
//		user.setEmail("sylee@gmail.com");
//		userService.registUser(user);
//		System.out.println("정상 등록 완료..");
		
//		List<User> list = userService.listAll();
//		System.out.println(list);
		
		
//		User findUser = userService.findById("bangry");
//		System.out.println(findUser);
		
//		User loginUser = userService.login("bangry", "11222");
//		System.out.println(loginUser);
		
//		List<User> searchList = userService.search("id", "bangry");
//		List<User> searchList = userService.search("name", "%기정%");
//		System.out.println(searchList);
		
//		int count = userService.searchCount("", "");
//		int count = userService.searchCount("id", "bangry");
//		int count = userService.searchCount("name", "기정");
//		System.out.println(count);
		
//		Params params = new Params();
//		Params params = new Params("name", "기정", 20, 10, 1);
//		List<User> list = userService.search(params);
//		for (User user : list) {
//			System.out.println(user);
//		}
		
//				CookbookService service = ServiceFactoryImpl.getInstance().getReceipeService();
//				
//				//bookId = recipeId
//
//						
//				List<Map<String, Object>> RecipeList = service.findAllRecipe(params);
		

	}

}









