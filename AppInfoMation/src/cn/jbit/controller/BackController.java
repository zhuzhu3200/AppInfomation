package cn.jbit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台控制器
 */
@Controller
@RequestMapping("/back")
public class BackController {
	
	/**
	 * 进入后台登录页面
	 * @return
	 */
	@RequestMapping("/backendlogin.html")
	public String backLogin(){
		
		return "backendlogin";
	}
	
}
