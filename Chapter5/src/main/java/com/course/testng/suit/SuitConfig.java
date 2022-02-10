package com.course.testng.suit;

import org.testng.annotations.*;

public class SuitConfig {

    @BeforeSuite
    public void beforeSuit() {
        System.out.println( "beforeSuit");
    }
    @AfterSuite
    public void AfterSuit() {
        System.out.println( "AfterSuit");
    }


    @BeforeTest
    public void jjs() {
        System.out.println("BeforeTest");
    }
}
