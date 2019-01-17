package ssmxzsc.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("ssmxzsc")
public class UserPageController {
	
//	@RequestMapping("../")
//	public String index() {
//		return "/index.html";
//	}
	@RequestMapping("/login")
	public String login() {
		return "user/page/login.html";
	}
}
