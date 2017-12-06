package com.yb.shardingjdbctest.service.impl;

import com.yb.shardingjdbctest.dao.PhoneMapper;
import com.yb.shardingjdbctest.domain.Phone;
import com.yb.shardingjdbctest.service.api.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements PhoneService {

	@Autowired
	private PhoneMapper phoneMapper;

    @Override
    public void save(Phone phone) {
        phoneMapper.save(phone);
    }

    @Override
    public List<Phone> getPhoneByPhoneId(Phone phone) {
        return phoneMapper.getPhoneByPhoneId(phone);
    }

    @Override
    public List<Phone> getPhoneByPhoneIdAndDatetime(Phone phone) {
        return phoneMapper.getPhoneByPhoneIdAndDatetime(phone);
    }
}
