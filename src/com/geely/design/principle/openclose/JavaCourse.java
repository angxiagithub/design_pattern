package com.geely.design.principle.openclose;

/**
 * @author angxia
 * @create 2018-11-27 18:47
 */
public class JavaCourse implements ICourse{
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

/*    @Override
    public Double getDiscountPrice() {
        return this.price*0.8;
    }*/
}
