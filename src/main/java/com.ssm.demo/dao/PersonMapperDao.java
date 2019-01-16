package com.ssm.demo.dao;

import com.ssm.demo.entity.Person;
import org.springframework.stereotype.Repository;

/**
 * @author Vincent Vincent
 * @version v1.0
 * @name SsmDemo
 * @page com.ssm.demo.dao
 * @class describe
 * @date 2019/1/16 10:09
 */
@Repository
public interface PersonMapperDao {
    Person findPersonById(long id);
}
