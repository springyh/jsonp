package cn.yh.jsonp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo2Controller {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
