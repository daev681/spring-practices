package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 * 
 * RequestMapping
 * 클래스 + 핸들러 (메소드)
 * @author bit - user
 * 
 */

@Controller
@RequestMapping("/user")
public class UserController {


	
	
	
	@RequestMapping(value = "/join" , method = RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/joinform.jsp";	
	}
	
	@RequestMapping(value = "/join" , method = RequestMethod.POST)
	public String join(@ModelAttribute UserVo vo) { // UserVo vo Model model
		// model.addAttribute("userVo, vo");
	
		System.out.println(vo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam(value ="n" ) String name) {
		
		/*
		 * 만일 n이라는 이름의 파라미터가 없는 경우
		 * 400 Bad Request 에러가 발생한다
		 */
		System.out.println(name);
		return "UpdateController.update1";
	}

	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value ="n"  ,  required = true , defaultValue = "") String name, 
			@RequestParam(value ="a"  ,  required = true , defaultValue = "0") int age) {
		if(name ==null) {
			name = "";
		}
		System.out.println(name + ": " + age );
		return "UpdateController.update2 " + name;
	}
	
	
}
