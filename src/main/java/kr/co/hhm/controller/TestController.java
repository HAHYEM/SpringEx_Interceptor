package kr.co.hhm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@RequestMapping(value="/doA")
	String doA(Model model, @RequestParam("msg") String msg) {
		System.out.println("doA실행중");
		model.addAttribute("info", msg);
		
		return "doA";
	}
	
	@RequestMapping(value="/doB")
	String doB() {
		System.out.println("doB 실행중");
		
		return "doB";
	}
}
