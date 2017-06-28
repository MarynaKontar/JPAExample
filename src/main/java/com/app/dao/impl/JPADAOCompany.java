package com.app.dao.impl;

import com.app.model.Company;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 23.06.2017.
 */
public class JPADAOCompany extends DAOGeneral<Company> {
    @Override
    public void find(Company entity) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.find(Company.class, entity.getId());

        em.getTransaction().commit();
    }
}
