package com.geely.design.principle.openclose;

/**
 * @author angxia
 * @create 2018-11-27 18:55
 */
public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(96,"java开发",368d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) course;
        System.out.println(javaCourse.getOriginPrice());
        System.out.println("课程ID："+javaCourse.getId()+"课程名称："+javaCourse.getName()+"课程价格："+javaCourse.getPrice());
    }
}
