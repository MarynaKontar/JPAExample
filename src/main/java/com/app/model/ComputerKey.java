package com.app.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

/**
 * Created by User on 22.06.2017.
 */
@Embeddable
public class ComputerKey implements Serializable{

    private String title;
    private  int price;

    public ComputerKey() {
    }

    public ComputerKey(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ComputerKey{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
