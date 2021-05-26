package com.ztqees.entity;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private String name;
    private Integer age;
    private String gender;
    private Date birthday;
    private String hobby;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public Person(String name, Integer age, String gender, Date birthday, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.hobby = hobby;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
