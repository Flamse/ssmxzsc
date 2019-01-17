package ssmxzsc.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ssmxzsc.po.User;
import ssmxzsc.service.UserService;

@Controller
@RequestMapping("/user/page")
public class CheckController {
	@Resource
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/unameCheck.do")
	public String unameChick(String uname) {
		String data = "no";
		if(userService.unameCheck(uname)) {
			data = "yes";
		}
		return data;
	}
	
	@ResponseBody
	@RequestMapping("/emailCheck.do")
	public String emailChick(String email) {
		String data = "no";
		if(userService.emailCheck(email)) {
			data = "yes";
		}
		return data;
	}
	
	@ResponseBody
	@RequestMapping("/phoneCheck.do")
	public String phoneChick(String phone) {
		String data = "no";
		if(userService.phoneCheck(phone)) {
			data = "yes";
		}
		return data;
	}
	
	@ResponseBody
	@RequestMapping("uaccountCheck.do")
	public String uaccountCheck(String uname, String upwd) {
		User user = new User();
		user.setUname(uname);
		user.setUpwd(upwd);
		if(userService.uaccountCheck(user)) {
			return "yes";
		}
		return "no";
	}
}
