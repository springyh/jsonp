package cn.yh.springmvc.controller;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.accessibility.internal.resources.accessibility;

import cn.yh.springmvc.pojo.Address;
import cn.yh.springmvc.pojo.Car;
import cn.yh.springmvc.pojo.User;
import cn.yh.springmvc.service.UsersService;
import cn.yh.springmvc.utils.CommonsResult;
@Controller
public class UsersController {
	@Resource
	private UsersService UsersServiceImpl;
	@RequestMapping("{page}")
	public String show(@PathVariable String page){
		return page;
	}
	@RequestMapping("registers")
	public String reg(User user,Address address,Car car,Model model){
		Map<String, String> map = new HashMap<>();
		int index  = UsersServiceImpl.insMutipartForm(user,address,car);
		if(index > 0){
			map.put("mess", "注册success");
			model.addAttribute("map", map);
			return "success";
		}else{
			map.put("mess", "注册error");
			model.addAttribute("map", map);
			return "register";
		}
	}
	
	/**
	 * 根据名字查询,防止注册时用户名重复
	 */
	@RequestMapping("selName")
	@ResponseBody
	public CommonsResult  queryUserByName(String uname){
		CommonsResult cr = new CommonsResult();
		User user  = UsersServiceImpl.selUserByName(uname);
		if(user!=null){
			cr.setStatus(200);
		}else{
			cr.setStatus(400);
		}
		return cr;
	}
	
	
}
