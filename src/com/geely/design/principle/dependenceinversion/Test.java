package com.geely.design.principle.dependenceinversion;

/**
 * @author angxia
 * @create 2018-11-28 16:44
 */
public class Test {
    public static void main(String[] args) {
/*        Geely geely = new Geely();
        geely.studyJavaCource();
        geely.studyFECource();*/

        Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new FECourse());
    }
}
