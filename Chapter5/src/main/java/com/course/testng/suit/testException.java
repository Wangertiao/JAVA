package com.course.testng.suit;

import org.testng.annotations.Test;

public class testException {


    //测试结果会失败的异常测试

    @Test(expectedExceptions = RuntimeException.class)
    public void runException() {

        System.out.println("这是一个会异常的测试");
    }

    //期望是失败的异常
    @Test(expectedExceptions = RuntimeException.class)
    public void trueException() {


        System.out.println("这个是是期望的异常");
//        int i = 1 / 0;
        throw new RuntimeException();
    }
}

