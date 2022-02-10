package com.course.testng.suit;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1() {
        System.out.println("runtest1");

//        throw new RuntimeException();
    }

    //dependsOnMethodsb表示依赖于test1  如果test1方法失败了 泽不执行test2
    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("runtest2");
    }
}
