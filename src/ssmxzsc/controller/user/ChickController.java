package ssmxzsc.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/ctrl")
public class ChickController {
	@ResponseBody
	@RequestMapping("/unameCheck.do")
	public String unameChick(String uname) {
		String data = "no";
		if(uname.equals("flamse")) {
			data = "yes";
		}
		return data;
	}
	
	@ResponseBody
	@RequestMapping("/emailCheck.do")
	public String emailChick(String email) {
		String data = "no";
		if(email.equals("flamse@163.com")) {
			data = "yes";
		}
		return data;
	}
	
	@ResponseBody
	@RequestMapping("/phoneCheck.do")
	public String phoneChick(String phone) {
		String data = "no";
		if(phone.equals("15270476656")) {
			data = "yes";
		}
		return data;
	}
}
