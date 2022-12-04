package com.hit.lyx.dubbo.demo.api.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HouseEntity {
    private String id;
    private String location;//位置
    private int unit_price;//每平方米价格
    private String tag;//所属小区
    private String right_year;//产权年限
    private String right_nature;//产权性质
    private String house_type;//类别
    private String direction;//朝向
    private boolean evelation;//是否有电梯
    private int measure;
    private List<Comment> comments=new ArrayList<>();

    public HouseEntity(String location, int unit_price, String tag, String right_year, String right_nature, String house_type, String direction, boolean evelation,int measure) {
        this.location = location;
        this.unit_price = unit_price;
        this.tag = tag;
        this.right_year = right_year;
        this.right_nature = right_nature;
        this.house_type = house_type;
        this.direction = direction;
        this.evelation = evelation;
        this.measure=measure;
        this.id= UUID.randomUUID().toString().replace("-", "");
    }

    public HouseEntity() {
        this.location = "";
        this.unit_price = 0;
        this.tag = "";
        this.right_year = "";
        this.right_nature = "";
        this.house_type = "";
        this.direction = "";
        this.evelation = false;
        this.measure=0;
        this.id= "";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRight_year() {
        return right_year;
    }

    public void setRight_year(String right_year) {
        this.right_year = right_year;
    }

    public String getRight_nature() {
        return right_nature;
    }

    public void setRight_nature(String right_nature) {
        this.right_nature = right_nature;
    }

    public String getHouse_type() {
        return house_type;
    }

    public void setHouse_type(String house_type) {
        this.house_type = house_type;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public boolean isEvelation() {
        return evelation;
    }

    public void setEvelation(boolean evelation) {
        this.evelation = evelation;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getMeasure() {
        return measure;
    }

    public void setMeasure(int measure) {
        this.measure = measure;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
