package ssmxzsc.controller.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ssmxzsc.po.Address;
import ssmxzsc.po.User;
import ssmxzsc.service.AddressService;

@Controller
@RequestMapping("/user/page")
public class AddressController {
	@Resource
	private AddressService addressService;
	
	@ResponseBody
	@RequestMapping("/addAddress.do")
	public String addAddress(Address address, HttpSession session) {
		User user = (User) session.getAttribute("userSession");
		address.setUserId(user.getPhone());
		if(addressService.addAddress(address)) 
			return "yes";
		return "no";
	}
}
