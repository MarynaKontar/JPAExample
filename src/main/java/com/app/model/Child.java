package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by User on 22.06.2017.
 */
@Entity
public class Child extends Parent {
    private String secondName;

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return super.toString() + "Child{" +
                "secondName='" + secondName + '\'' +
                '}';
    }
}
