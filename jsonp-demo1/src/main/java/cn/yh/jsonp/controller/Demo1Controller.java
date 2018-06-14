package cn.yh.jsonp.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller	
public class Demo1Controller {
//	@RequestMapping("demo1")
//	@ResponseBody
//	public Map<String, Object> demo1(){
//		Map<String, Object> map = new HashMap<>();
//		map.put("name", "张三");
//		return map;
//	}
//	
	/**
	 * jsonp跨域请求写法  demo2项目中index中ajax发送的请求,请求的是这里
	 */
	
	@RequestMapping("demo")
	@ResponseBody
	public MappingJacksonValue demo(String theFunction){
		Map<String,Object> map = new HashMap<>();
		map.put("age", 12);
		//jackson工具包提供的类,自动生成jsonp需要的格式:回调函数(json数据)
		MappingJacksonValue mjv = new MappingJacksonValue(map);
		mjv.setJsonpFunction(theFunction);
		return mjv;
	}
}
