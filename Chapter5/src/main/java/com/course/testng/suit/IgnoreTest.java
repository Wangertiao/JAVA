package com.course.testng.suit;

import org.testng.annotations.Test;

/**
 * 忽略测试  test注解中 enable属性学习
 */
public class IgnoreTest {

    @Test
    public void dasd() {
        System.out.println("test1");
    }


    //配置了enable为false则不执行该用例
    @Test(enabled = false)
    public void dassd() {
        System.out.println("test2");
    }

}
