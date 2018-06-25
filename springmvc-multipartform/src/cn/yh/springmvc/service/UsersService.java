package cn.yh.springmvc.service;

import cn.yh.springmvc.pojo.Address;
import cn.yh.springmvc.pojo.Car;
import cn.yh.springmvc.pojo.User;

public interface UsersService {
	/**
	 * 四张表新增
	 * @param user
	 * @param address
	 * @param car
	 * @return
	 */
	int insMutipartForm(User user, Address address, Car car);
	/**
	 * 根据用户名查询用户是否存在
	 * @param uname
	 * @return
	 */
	User selUserByName(String uname);
	
}
