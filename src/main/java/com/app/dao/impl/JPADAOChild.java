package com.app.dao.impl;

import com.app.model.Child;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 23.06.2017.
 */
public class JPADAOChild extends DAOGeneral<Child> {
    @Override
    public void find(Child entity) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.find(Child.class, entity.getId());

        em.getTransaction().commit();
    }
}
