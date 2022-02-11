package com.tester;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void test1() {
        System.out.println("aaa");
        Assert.assertEquals(1,1);
        Log.info("登陆成功");
    }
   @Test
    public void test2() {
        System.out.println("bbb");
        Assert.assertEquals(2,2);
    }
    @Test
    public void test3() {
        System.out.println("aaa");
        Assert.assertEquals(2,2);

    }
    @Test
    public void test4() {
        Reporter.log("自己编写的log");
        throw new RuntimeException("编写的运行时异常");
    }
}
