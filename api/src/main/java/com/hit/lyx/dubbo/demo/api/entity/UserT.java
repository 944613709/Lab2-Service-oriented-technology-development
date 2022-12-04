package com.hit.lyx.dubbo.demo.api.entity;

public class UserT {
    private String name;
    private int sex;//0 for male;1 for female
    private int age;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String phone;

    public UserT(String name, int sex, int age, String desc, String phone, String location) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.desc = desc;
        this.phone = phone;
        this.location = location;
    }

    private String location;
}
