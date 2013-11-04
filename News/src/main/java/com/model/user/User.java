package com.model.user;

/**
 * Created with IntelliJ IDEA.
 * User: gz
 * Date: 13-10-31
 * Time: 下午10:02
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int roleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
