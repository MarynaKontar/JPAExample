package com.app.model;

import javax.persistence.*;

/**
 * Created by User on 22.06.2017.
 */
@Entity
public class Dog {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    private String name;
@Enumerated (EnumType.STRING)
private ColorType colorType;

private float feight;

    public Dog() {
    }

    public Dog(ColorType color, float feight) {
        this.colorType = color;
        this.feight = feight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public float getFeight() {
        return feight;
    }

    public void setFeight(float feight) {
        this.feight = feight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colorType=" + colorType +
                ", feight=" + feight +
                '}';
    }
}
