package cn.jbit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 开发者控制器
 */
@Controller
@RequestMapping("/dev")
public class DevController {

	/**
	 * 进入开发者登录页面
	 * @return
	 */
	@RequestMapping("/devlogin.html")
	public String devLogin(){
		
		return "devlogin";
	}
	
}
