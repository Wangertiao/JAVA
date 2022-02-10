package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "one")
public class GrouponeTest {

    public void sjj() {
        System.out.println("one 中的方法");
    }
}
