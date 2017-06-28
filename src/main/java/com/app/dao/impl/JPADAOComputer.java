package com.app.dao.impl;

import com.app.model.Computer;
import com.app.model.Dog;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 22.06.2017.
 */
public class JPADAOComputer extends DAOGeneral<Computer> {



    public void find(Computer computer) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.find(Computer.class, computer.getComputerKey());

        em.getTransaction().commit();

    }
}
