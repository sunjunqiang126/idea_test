package com.free.pojo;

/**
 * @Auther:http://www.free.com
 * @Date:2020/11/26 0026
 * @Description:com.free.pojo
 * @version:1.0
 */
public class Users {
    private int id;
    private String username;
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return this.username+" "+this.pwd+" "+this.id;
    }
}
