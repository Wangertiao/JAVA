package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    /**
     * BeforeSuit  套件之前      放在suit类
     * BeforeTest
     * BeforClass类运行之前      放在用例类
     * BeforeMethod方法之前
     * 测试用例1
     * AfterMethod方法之后
     * BeforeMethod方法之前
     * 测试用例2
     * AfterMethod方法之后
     * AfterClass类运行之后
     * AfterTest
     * AfterSuit  套件之后
     */

    @Test
    public void testCase1() {
        System.out.println("测试用例1");
    }
    @Test
    public void testCase2() {
        System.out.println("测试用例2");
    }

    //suit之前（一般写在 suit类里面）
    @BeforeSuite
    public void BeforeSuit() {
        System.out.println("BeforeSuit  套件之前");
    }

    @AfterSuite
    public void AfterSuit() {
        System.out.println( "AfterSuit  套件之后");

    }

    @BeforeTest
    public void sa() {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void sdas() {
        System.out.println( "AfterTest");
    }

    //方法之前（写在test类里面）
    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("BeforeMethod方法之前");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("AfterMethod方法之后");
    }

    //一般写在 test类里面
    @BeforeClass
    public void BeforClass() {
        System.out.println("BeforClass类运行之前");
    }
    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass类运行之后");
    }
}
