package com.zl.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-2
 * Time: 下午4:19
 * To change this template use File | Settings | File Templates.
 */
public class Userlogin {
    private String id;
    private String username;
    private String password;
    private Userdetail userdetail;

    public Userdetail getUserdetail() {
        return userdetail;
    }

    public void setUserdetail(Userdetail userdetail) {
        this.userdetail = userdetail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Userlogin userlogin = (Userlogin) o;

        if (id != null ? !id.equals(userlogin.id) : userlogin.id != null) return false;
        if (password != null ? !password.equals(userlogin.password) : userlogin.password != null) return false;
        if (username != null ? !username.equals(userlogin.username) : userlogin.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
