package com.geely.design.pattern.creational.simplefactory;

/**
 * @author angxia
 * @create 2018-12-02 22:03
 */
public class VideoFactory {
    public  Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video)Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return video;
    }

    /*    public  Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        } else if("Python".equalsIgnoreCase(type)){
            return new PythonVideo();
        } else {
            return null;
        }
    }*/
}
