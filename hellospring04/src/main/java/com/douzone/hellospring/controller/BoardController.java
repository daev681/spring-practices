package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 
 * @RequestMapping
 *  메소드 단독 매핑
 *  
 *  
 * 
 */

@Controller
public class BoardController {

	
	/*    http://localhost:8080/hellospring03/board/view/5 */
	@ResponseBody
	@RequestMapping("/board/view/{no}")
	public String view(@PathVariable("no") Long boardNo) {
		  return "BoardController:view("+ boardNo + ")";
	}
	

	
}
