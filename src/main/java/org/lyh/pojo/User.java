package org.lyh.pojo;

import java.util.Date;

public class User {

    private int id;

    private String name;

    private Date birth;

    private String school;

    public User() {
    }

    public User(int id, String name, Date birth, String school) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", school='" + school + '\'' +
                '}';
    }
}
