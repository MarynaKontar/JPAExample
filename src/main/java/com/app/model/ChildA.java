package com.app.model;

import javax.persistence.Entity;

/**
 * Created by User on 22.06.2017.
 */
@Entity
public class ChildA extends Parent {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "ChildA{" +
                "age=" + age +
                '}';
    }
}
