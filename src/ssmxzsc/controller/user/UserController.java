package ssmxzsc.controller.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ssmxzsc.po.User;
import ssmxzsc.service.UserService;

@Controller
@RequestMapping("/user/page")
public class UserController {
	@Resource
	private UserService userService;
	
	/**
	 * 用户注册
	 * @param user
	 * @return 功返回登录界面
	 */
	@RequestMapping("/regist.do")
	public String regist(User user) {
		if(userService.plusUser(user))
			return "/login.html";
		return "/regist.html";
	}
	
	/**
	 * 登录匹配
	 * @param user
	 * @param request
	 * @return 成功返回yes，并设置session
	 */
	@ResponseBody
	@RequestMapping("/login.do")
	public String login(User user, HttpSession session) {
		//打印user
		//System.out.println(user.toString());
		User userReturn = userService.login(user);
		if(userReturn!=null) {
			session.setAttribute("userSession",userReturn);
			return "yes";
		}
		return "no";
	}
	
	/**
	 * 修改密码
	 * @param session
	 * @return 
	 */
	@ResponseBody
	@RequestMapping("/changePassword.do")
	public String changePassword(User user, String npwd) {
		//问题在于：user取的是旧密码，新密码是npwd，所以该的还是那个旧密码
		user.setUpwd(npwd);
		if(userService.changePassword(user))
			return "yes";
		return "no";
	}
}
