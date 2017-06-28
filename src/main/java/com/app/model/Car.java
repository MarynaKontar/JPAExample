package com.app.model;

import javax.persistence.*;

/**
 * Created by User on 22.06.2017.
 */
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String name;
    @Embedded
private Engine engine;

    public Car() {
    }

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", engine=" + engine +
                '}';
    }
}
