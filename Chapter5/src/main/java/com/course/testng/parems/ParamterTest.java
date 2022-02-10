package com.course.testng.parems;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 用xml给方法中传递值
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void tset(String name, String age) {
        System.out.println("name ="+name +"age = "+age);
    }
}
