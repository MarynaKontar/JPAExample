package com.app.model;

import javax.persistence.*;

/**
 * Created by User on 29.06.2017.
 */
@Entity
public class Jet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String manufacture;
    private String model;
    private int price;
    //Специально вводят @Version, чтобЫ при одновременном доступе выпадала ошибка, а не сохранялось в БД только самое последнее изменение
    @Version
    private long version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
