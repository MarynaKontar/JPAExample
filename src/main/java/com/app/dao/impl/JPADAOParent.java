package com.app.dao.impl;

import com.app.model.Parent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 23.06.2017.
 */
public class JPADAOParent extends DAOGeneral<Parent>{
    @Override
    public void find(Parent entity) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.find(Parent.class, entity.getId());

        em.getTransaction().commit();

    }
}
