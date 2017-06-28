package com.app.dao.impl;

import com.app.model.ChildA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 23.06.2017.
 */
public class JPADAOChildA extends DAOGeneral<ChildA> {
    @Override
    public void find(ChildA entity) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.find(ChildA.class, entity.getId());

        em.getTransaction().commit();
    }
}
