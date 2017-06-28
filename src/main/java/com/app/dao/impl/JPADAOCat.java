package com.app.dao.impl;

import com.app.dao.DAO;
import com.app.model.Animal;
import com.app.model.Cat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 22.06.2017.
 */
public class JPADAOCat extends DAOGeneral<Cat> {

    @Override
    public void find(Cat entity) {//НЕ ДОДЕЛАН
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

//        em.find(Cat.class, entity.getId());

        em.getTransaction().commit();
    }
}
