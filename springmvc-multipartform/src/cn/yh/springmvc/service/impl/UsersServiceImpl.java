package cn.yh.springmvc.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.apache.taglibs.standard.lang.jstl.NullLiteral;
import org.springframework.stereotype.Service;

import com.sun.media.sound.ModelStandardIndexedDirector;

import cn.yh.springmvc.mapper.AddressMapper;
import cn.yh.springmvc.mapper.CarMapper;
import cn.yh.springmvc.mapper.MidderMapper;
import cn.yh.springmvc.mapper.UserMapper;
import cn.yh.springmvc.pojo.Address;
import cn.yh.springmvc.pojo.Car;
import cn.yh.springmvc.pojo.Midder;
import cn.yh.springmvc.pojo.User;
import cn.yh.springmvc.pojo.UserExample;
import cn.yh.springmvc.service.UsersService;
import cn.yh.springmvc.utils.IDUtils;
@Service
public class UsersServiceImpl implements UsersService {
	@Resource
	private UserMapper userMapper;
	@Resource
	private CarMapper carMapper; 
	@Resource
	private AddressMapper addressMapper;
	@Resource
	private MidderMapper midderMapper;
	@Override
	public int insMutipartForm(User user, Address address, Car car) {
		long uid = IDUtils.genItemId();
		long cid = IDUtils.genItemId();
		long aid = IDUtils.genItemId();
		long mid = IDUtils.genItemId();
		user.setId(uid);
		car.setId(cid);
		address.setId(aid);
		int index = -1;
		//新增user表
		index = userMapper.insertSelective(user);
		
		//新增car表
		index = carMapper.insertSelective(car);
		
		//新增address表
		index = addressMapper.insertSelective(address);
		
		//新增midder表
		Midder midder = new Midder();
		midder.setId(mid);
		midder.setUid(uid);
		midder.setCid(cid);
		midder.setAid(aid);
		index = midderMapper.insertSelective(midder);
		return 1;
	}
	@Override
	public User selUserByName(String uname) {
		UserExample example = new UserExample();
		example.createCriteria().andUnameEqualTo(uname);
		List<User> list = userMapper.selectByExample(example);
		if(list!= null && list.size() >0){
			return list.get(0);
		}
		return null;
	}

}
