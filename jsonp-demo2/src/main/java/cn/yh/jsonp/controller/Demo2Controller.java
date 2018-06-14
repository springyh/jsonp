package cn.yh.jsonp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo2Controller {
	/*
		这是访问index页面的控制器
		我的博客地址是:www.csdn.cn
	*/
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
