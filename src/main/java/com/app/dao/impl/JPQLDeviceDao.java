package com.app.dao.impl;

import com.app.model.Device;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by User on 29.06.2017.
 */
public class JPQLDeviceDao {

    public List<Device> readAllDevicesForPaging(int pageNumber, int amountOfRecords){
        EntityManagerFactory factory =  Persistence.createEntityManagerFactory("unit1");
        EntityManager em=factory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Device> typedQuery = em.createNamedQuery("Device.findAll", Device.class);
        typedQuery.setFirstResult(pageNumber*amountOfRecords);
        typedQuery.setMaxResults(amountOfRecords);
        List<Device> devices=typedQuery.getResultList();

        em.getTransaction().commit();
        return devices;
    }

    public List<Device> readAllDevicesByModel(String model){
        EntityManagerFactory factory =  Persistence.createEntityManagerFactory("unit1");
        EntityManager em=factory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Device> typedQuery = em.createNamedQuery("Device.findByModel", Device.class);
        typedQuery.setParameter("model", model);
        List<Device> devices=typedQuery.getResultList();
        em.getTransaction().commit();
        return devices;
    }


    public long readSumOfPriceOfAllDevices(){
        EntityManagerFactory factory =  Persistence.createEntityManagerFactory("unit1");
        EntityManager em=factory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Long> typedQuery = em.createNamedQuery("Device.totalSum", Long.class);
        Long count=typedQuery.getSingleResult();
        em.getTransaction().commit();
        return count;
    }

    public long readAllDevicesCount(){
        EntityManagerFactory factory =  Persistence.createEntityManagerFactory("unit1");
        EntityManager em=factory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Long> typedQuery = em.createNamedQuery("Device.findCountAll", Long.class);
        Long count=typedQuery.getSingleResult();
        em.getTransaction().commit();
        return count;
    }

    public List<Device> readAllDevices(){
        EntityManagerFactory factory =  Persistence.createEntityManagerFactory("unit1");
        EntityManager em=factory.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Device> typedQuery = em.createNamedQuery("Device.findAll", Device.class);
        List<Device> devices=typedQuery.getResultList();
        em.getTransaction().commit();
        return devices;
    }

    public void createDevice(int n){
        EntityManagerFactory factory =  Persistence.createEntityManagerFactory("unit1");
        EntityManager em=factory.createEntityManager();
        em.getTransaction().begin();
        for(int i=0;i<n;i++){
            Device d = new Device();
            d.setManufacture("Manufacture"+i);
            d.setPrice(i+10);
            d.setModel("Model"+i);
            em.persist(d);
        }
        em.getTransaction().commit();
    }
}
