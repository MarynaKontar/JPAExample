package com.app.dao.impl;

import com.app.model.Department;
import com.app.model.Parent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 23.06.2017.
 */
public class JPADAODepartment extends DAOGeneral<Department> {
    @Override
    public void find(Department entity) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.find(Department.class, entity.getId());

        em.getTransaction().commit();
    }
}
