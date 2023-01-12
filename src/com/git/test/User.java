package com.git.test;

/**
 * CLassName: User
 * Package: com.git.test
 * Description:
 *
 * @Author: GuRain
 * @Create: 2023/1/12 - 18:53
 * @Version: v1.0
 */
public class User {
    private String name;
    private String userName ;
    private String passWord;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public User() {
    }

    public User(String name, String userName, String passWord) {
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
