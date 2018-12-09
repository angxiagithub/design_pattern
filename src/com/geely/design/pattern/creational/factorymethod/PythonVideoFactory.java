package com.geely.design.pattern.creational.factorymethod;

/**
 * @author angxia
 * @create 2018-12-03 17:40
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
