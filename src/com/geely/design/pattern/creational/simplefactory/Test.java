package com.geely.design.pattern.creational.simplefactory;

/**
 * @author angxia
 * @create 2018-12-02 22:01
 */
public class Test {
    public static void main(String[] args) {

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();
        /*        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("python");
        if (video == null) {
            return;
        }
        video.produce();*/
        /*        Video video = new JavaVideo();
        video.produce();*/
    }
}
