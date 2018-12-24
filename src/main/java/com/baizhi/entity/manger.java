package com.baizhi.entity;

public class manger {
    private String id;
    private String password;
    private String code;

    public manger() {
        super();
    }

    @Override
    public String toString() {
        return "manger{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public manger(String id, String password, String code) {
        this.id = id;
        this.password = password;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
