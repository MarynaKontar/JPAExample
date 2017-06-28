package com.app.dao.impl;

import com.app.dao.DAO;
import com.app.model.Animal;
import com.app.model.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 22.06.2017.
 */
public class JPADAOAnimal extends DAOGeneral<Animal> {
    @Override
    public void find(Animal animal) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.find(Animal.class, animal.getId());

        em.getTransaction().commit();

    }

    public void listenerAnimal(){

    }
}