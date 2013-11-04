package com.action;

import com.model.user.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-2
 * Time: 上午10:34
 * To change this template use File | Settings | File Templates.
 */
public class LoginAction extends ActionSupport {
    User user = new User();
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    @Override
    public void validate() {
        super.validate();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
