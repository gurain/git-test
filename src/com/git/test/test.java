package com.git.test;
/**
 * CLassName: test
 * Package: com.git.test
 * Description:
 * Author: GuRain
 * Create: 2023/1/12 - 18:50
 * Version: v1.0
 */
public class test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        User u1 = new User("admin","管理员","123123");
        System.out.println(u1);
        User u2 = new User("admin","管理员","123123");
        System.out.println(u2);
        System.out.println("gitee push");
    }
}
