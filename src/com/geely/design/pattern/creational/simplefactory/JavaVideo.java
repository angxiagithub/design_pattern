package com.geely.design.pattern.creational.simplefactory;

/**
 * @author angxia
 * @create 2018-12-02 21:58
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
