package com.yb.shardingjdbctest.dao;

import com.yb.shardingjdbctest.domain.Phone;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public interface PhoneMapper {

    void save(Phone phone);

    List<Phone> getPhoneByPhoneId(Phone phone);

    List<Phone> getPhoneByPhoneIdAndDatetime(Phone phone);
}