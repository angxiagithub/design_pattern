package com.geely.design.principle.dependenceinversion;

/**
 * @author angxia
 * @create 2018-11-28 17:04
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
