package cn.jbit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * �����߿�����
 */
@Controller
@RequestMapping("/dev")
public class DevController {

	/**
	 * ���뿪���ߵ�¼ҳ��
	 * @return
	 */
	@RequestMapping("/devlogin.html")
	public String devLogin(){
		
		return "devlogin";
	}
	
}
