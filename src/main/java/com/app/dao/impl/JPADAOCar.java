package com.app.dao.impl;

import com.app.dao.DAO;
import com.app.model.Car;
import com.app.model.Dog;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 22.06.2017.
 */
public class JPADAOCar  extends DAOGeneral<Car> {


    public void find(Car car) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.find(Car.class, car.getId());

        em.getTransaction().commit();

    }
}
