package com.ssm.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssm.demo.entity.Person;
import com.ssm.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Vincent Vincent
 * @version v1.0
 * @name SsmDemo
 * @page com.ssm.demo.controller
 * @class describe
 * @date 2019/1/16 10:08
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;
    @RequestMapping(value = "/selectPerson",method = RequestMethod.GET)
    public void selectPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        long personId = Long.parseLong(request.getParameter("id"));
        Person person =personService.findPersonById(personId);

        ObjectMapper mapper = new ObjectMapper();

        response.getWriter().write(mapper.writeValueAsString(person));
        response.getWriter().close();
    }
}
