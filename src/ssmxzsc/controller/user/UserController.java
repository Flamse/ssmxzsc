package ssmxzsc.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ssmxzsc.entity.User;

@Controller
@RequestMapping("/user/ctrl")
public class UserController {
	@RequestMapping("/regist.do")
	public String regist(User user) {
		System.out.println(user.toString());
		return "../page/login.html";
	}
}
