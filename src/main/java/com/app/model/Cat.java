package com.app.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

/**
 * Created by User on 22.06.2017.
 */
@Entity
public class Cat {
    @Id
    private String name;
    @Id
private int age ;
    @Enumerated(EnumType.STRING)
    private ColorType colorType;

    public Cat() {
    }

    public Cat(String name, int age, ColorType color) {
        this.name = name;
        this.age = age;
        this.colorType = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colorType=" + colorType +
                '}';
    }
}
