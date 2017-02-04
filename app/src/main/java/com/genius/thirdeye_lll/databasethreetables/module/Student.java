package com.genius.thirdeye_lll.databasethreetables.module;

/**
 * Created by ThirdEye-lll on 2/4/2017.
 */

public class Student {
    private String id;
    private String name;
    private String description;
    private String email;
    private String phone;
    private String varsityId;
    private String deartment;

    public Student(String id, String name, String description, String email, String phone, String varsityId, String deartment) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.varsityId = varsityId;
        this.deartment = deartment;
    }


    public Student(String name, String description, String email, String phone, String varsityId, String deartment) {
        this.name = name;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.varsityId = varsityId;
        this.deartment = deartment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVarsityId() {
        return varsityId;
    }

    public void setVarsityId(String varsityId) {
        this.varsityId = varsityId;
    }

    public String getDeartment() {
        return deartment;
    }

    public void setDeartment(String deartment) {
        this.deartment = deartment;
    }
}
