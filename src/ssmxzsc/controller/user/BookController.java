package ssmxzsc.controller.user;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ssmxzsc.po.Book;
import ssmxzsc.po.User;
import ssmxzsc.service.BookService;

@Controller
@RequestMapping("/user/page")
public class BookController {
	@Resource
	private BookService bookService;
	
	@RequestMapping("/index")
	public String allBook(User user, Model model) {
		List<Book> books = bookService.loadAllBook();
		model.addAttribute("books", books);
		/**
		 * 页面资源确实加载了，但访问路径没变
		 */
		return "/index.html";
	}
	
	/**
	 * 加入购物车
	 * @param book
	 * @return
	 */
	@RequestMapping("/addToCart.htm")
	public String addCart(Book book) {
		if(bookService.addToCart(book))
			return "yes";
		return "no";
	}
	

	@RequestMapping("/collect.do")
	public String collect(HttpSession session,Model model) {
		System.out.println("Hello");
//		session.setAttribute("user",new User("12345678901","user01","000000","user01@abc",0));
		User user = (User) session.getAttribute("userSession");
		String userId=user.getPhone();
		System.out.println(userId);
		List<Book> books=bookService.getBookByUserId(user.getPhone());
		model.addAttribute("books",books);
		System.out.println(books.size());
		return "/user/page/collect.jsp";
	}
	
}
