package com.app.model;

import javax.persistence.*;

/**
 * Created by User on 22.06.2017.
 */
public class AnimalListener {

@PostPersist
    public void postPersist(Object o){
    System.out.println("PostPersist");
}

@PrePersist
    public void prePersist(Animal o){
        o.setName("В listenere поменяла имя");
    System.out.println("PostPersist");
}

    @PreRemove
    public void preRemove(Object o){
        if(o.getClass()==Animal.class){
            Animal a =(Animal) o;
            a.setName("В listenere поменяла имя");
        }
        else {}
        System.out.println("PreRemove");
    }

    @PostRemove
    public void postRemove(Object o){
        System.out.println("PostRemove");
    }

    @PreUpdate
    public void preUpdate(Object o){
        System.out.println("PreUpdate");
    }

    @PostUpdate
    public void postUpdate(Object o){
        System.out.println("PostUpdate");
    }

    @PostLoad
    public void postLoad(Object o){
        System.out.println("PostLoad");
    }

}
