package com.app.model;

import javax.persistence.Embeddable;

/**
 * Created by User on 22.06.2017.
 */
@Embeddable
public class Engine {

    private  String engineName;
    private   float  volume;

    public Engine() {
    }

    public Engine(String engineName, int volume) {
        this.engineName = engineName;
        this.volume = volume;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public  float  getVolume() {
        return volume;
    }

    public void setVolume( float  volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineName='" + engineName + '\'' +
                ", volume=" + volume +
                '}';
    }
}
