package com.yb.shardingjdbctest.service.api;

import com.yb.shardingjdbctest.domain.Phone;

import java.util.List;

/**
 * PhoneService
 */
public interface PhoneService {

    void save(Phone phone);

    List<Phone> getPhoneByPhoneId(Phone phone);

    List<Phone> getPhoneByPhoneIdAndDatetime(Phone phone);
}
