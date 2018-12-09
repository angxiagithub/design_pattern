package com.geely.design.principle.dependenceinversion;

/**
 * @author angxia
 * @create 2018-11-28 16:42
 */
public class Geely {
/*    public void studyJavaCource(){
        System.out.println("Geely学习Java课程");
    }
    public void studyFECource(){
        System.out.println("Geely学习前端课程");
    }*/
    public void studyImoocCourse(ICourse course){
        course.studyCourse();
    }
}
