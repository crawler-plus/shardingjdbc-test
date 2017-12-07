package com.yb.shardingjdbctest.controller;

import com.dangdang.ddframe.rdb.sharding.keygen.KeyGenerator;
import com.github.pagehelper.PageHelper;
import com.yb.shardingjdbctest.domain.BaseEntity;
import com.yb.shardingjdbctest.domain.Phone;
import com.yb.shardingjdbctest.service.api.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 手机Controller
 */

@RestController
@RequestMapping("/phone")
public class PhoneController {

	@Autowired
	private PhoneService phoneService;

	@Autowired
	private KeyGenerator idGenerator;

	/**
	 * 保存手机号信息
	 */
	@GetMapping(path = "/savePhone/{phoneNum}/{datetime}")
	public BaseEntity savePhone(@PathVariable("phoneNum") String phoneNum, @PathVariable("datetime") String datetime) {
		Phone phone = new Phone();
		phone.setId(String.valueOf(idGenerator.generateKey().longValue()));
		phone.setPhoneNum(phoneNum);
		phone.setDatetime(datetime);
		phoneService.save(phone);
		return new BaseEntity();
	}

	/**
	 * 根据手机号查询手机号信息
	 */
	@GetMapping("/getPhoneByPhoneId/{phoneNum}")
	public BaseEntity getPhoneByPhoneId(@PathVariable("phoneNum") String phoneNum) {
		long start = System.currentTimeMillis();
		// 分页查询
		PageHelper.startPage(1,4);
		Phone phone = new Phone();
		phone.setPhoneNum(phoneNum);
		List<Phone> phones = phoneService.getPhoneByPhoneId(phone);
		BaseEntity be = new BaseEntity();
		be.setMsgCode("200");
		be.setContent(phones);
		System.out.println(System.currentTimeMillis() - start);
		return be;
	}

	/**
	 * 根据手机号和日期查询手机号信息
	 */
	@GetMapping("/getPhoneByPhoneIdAndDatetime/{phoneNum}/{datetime}")
	public BaseEntity getPhoneByPhoneIdAndDatetime(@PathVariable("phoneNum") String phoneNum, @PathVariable("datetime") String datetime) {
		// 分页查询
		PageHelper.startPage(1,4);
		Phone phone = new Phone();
		phone.setPhoneNum(phoneNum);
		phone.setDatetime(datetime);
		List<Phone> phones = phoneService.getPhoneByPhoneIdAndDatetime(phone);
		BaseEntity be = new BaseEntity();
		be.setMsgCode("200");
		be.setContent(phones);
		return be;
	}

	/**
	 * 批量保存手机号信息
	 */
	@GetMapping("/batchSavePhones")
	public BaseEntity batchSavePhones() {
		long start = System.currentTimeMillis();
		for(long i = 13000000000L; i < 13000099999L; i ++) {
			Phone phone = new Phone();
			phone.setId(String.valueOf(idGenerator.generateKey().longValue()));
			phone.setPhoneNum(String.valueOf(i));
			phone.setDatetime("201712");
			phoneService.save(phone);
		}
		System.out.println(System.currentTimeMillis() - start);
		return new BaseEntity();
	}

	/**
	 * used for ab testing!
	 */
	@GetMapping("/test")
	public BaseEntity test() {
		return new BaseEntity();
	}

}
