package com.geely.design.pattern.creational.factorymethod;

/**
 * @author angxia
 * @create 2018-12-02 22:00
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
