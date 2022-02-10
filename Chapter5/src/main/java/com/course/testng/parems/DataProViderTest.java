package com.course.testng.parems;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProViderTest {


    //从data1中获取参数
    @Test(dataProvider = "data1")
    public void test1(String name, String age) {

        System.out.println("test1--"+"name ="+name +"age = "+age);
    }

    @DataProvider(name = "data1")
    public Object[][] method1(){

        return new Object[][]{
                {"zhangsan", "10"},
                {"lisi" ,"20"}
        };
    }

    //从data2中获取参数
    @Test(dataProvider = "data2")
    public void test2(String name, String age) {

        System.out.println("test2--"+"name ="+name +" age = "+age);
    }

    //从data2中获取参数
    @Test(dataProvider = "data2")
    public void test3(String name, String age) {

        System.out.println("test3--"+"name ="+name +" age = "+age);
    }



    //定义获取数据的名称
    @DataProvider(name = "data2")
    public Object[][] method1(Method method) {

        Object[][] result = null;
        //判断是哪个方法名称  获取的数据不一致
        if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"zhangsan", "10"}
            };


        } else if (method.getName().equals("test3")) {

            result=new Object[][]{
                    {"lisi", "20"}
            };
        }




        return result;
    }
}

