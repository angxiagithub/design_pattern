package com.geely.design.pattern.creational.factorymethod;

/**
 * @author angxia
 * @create 2018-12-02 22:01
 */
public class Test {
    public static void main(String[] args) {

        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
