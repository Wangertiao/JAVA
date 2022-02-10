package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


/**
 * testng 组的学习
 */
public class GroupTest {
    //给case加上一个组的名称
    @Test(groups = "client")
    public void test1() {
        System.out.println("客户端组111111111");
    }

    @Test(groups = "client")
    public void test2() {
        System.out.println("客户端组222222222");
    }

    @Test(groups = "server")
    public void test3() {
        System.out.println("服务端组111111111");
    }

    @Test(groups = "server")
    public void test4() {
        System.out.println("服务端组2222222");
    }

    //需要加上组的名称  -- 指定的组之前 执行
    @BeforeGroups("server")
    public void test11() {
        System.out.println("服务端组之前执行的方法");
    }

    @AfterGroups("server")
    public void test21() {
        System.out.println("服务端组之hou执行的方法");
    }
}
