package com.ssm.demo.entity;

/**
 * @author Vincent Vincent
 * @version v1.0
 * @name SsmDemo
 * @page com.ssm.demo.entity
 * @class describe
 * @date 2019/1/16 10:09
 */
public class Person {
    private long id;
    private String name;
    private String email;
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    //getter  setter

    @Override
    public String toString(){
        return this.getId()+"---"+this.getName()+"---"+
                this.getEmail()+"---"+this.getStatus();
    }


}
