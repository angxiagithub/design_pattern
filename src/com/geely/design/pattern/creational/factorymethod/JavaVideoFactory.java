package com.geely.design.pattern.creational.factorymethod;

/**
 * @author angxia
 * @create 2018-12-03 17:34
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
