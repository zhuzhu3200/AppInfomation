package cn.jbit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ��̨������
 */
@Controller
@RequestMapping("/back")
public class BackController {
	
	/**
	 * �����̨��¼ҳ��
	 * @return
	 */
	@RequestMapping("/backendlogin.html")
	public String backLogin(){
		
		return "backendlogin";
	}
	
}
