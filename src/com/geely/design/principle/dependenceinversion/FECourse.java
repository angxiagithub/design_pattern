package com.geely.design.principle.dependenceinversion;

/**
 * @author angxia
 * @create 2018-11-28 17:06
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习前端课程");
    }
}
