package com.app.dao.impl;

import com.app.dao.DAO;
import com.app.model.Animal;
import com.app.model.Dog;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 22.06.2017.
 */
public class JPADAODog extends  DAOGeneral<Dog> {


    public void find(Dog dog) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.find(Dog.class, dog.getId());

        em.getTransaction().commit();

    }
}
