package com.ssm.demo.service;

import com.ssm.demo.entity.Person;

/**
 * @author Vincent Vincent
 * @version v1.0
 * @name SsmDemo
 * @page com.ssm.demo.service
 * @class describe
 * @date 2019/1/16 10:09
 */
public interface PersonService {
    Person findPersonById(long id);
}
