package com.app.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Created by User on 22.06.2017.
 */
@Entity
public class Computer {
    @EmbeddedId
    private ComputerKey computerKey;

    private String manufactor;

    public ComputerKey getComputerKey() {
        return computerKey;
    }

    public Computer() {
    }

    public Computer(ComputerKey computerKey, String manufector) {
        this.computerKey = computerKey;
        this.manufactor = manufector;
    }

    public void setComputerKey(ComputerKey computerKey) {
        this.computerKey = computerKey;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerKey=" + computerKey +
                ", manufactor='" + manufactor + '\'' +
                '}';
    }
}
