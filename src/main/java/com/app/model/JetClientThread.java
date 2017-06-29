package com.app.model;

import javax.persistence.*;

/**
 * Created by User on 29.06.2017.
 */
public class JetClientThread  extends Thread {
    private long delay;
    private String modelName;

    public JetClientThread(long delay, String modelName) {
        this.delay = delay;
        this.modelName = modelName;
    }

    @Override
    public void run() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = factory.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();

        //SELECT * FROM TABLE FOR UPDATE
        //Pessimistic lock

        Jet jet = em.find(Jet.class,1);
//        Jet jet = em.find(Jet.class,1, LockModeType.PESSIMISTIC_READ);
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis()-start<delay){
        }
        jet.setModel(modelName);
        em.merge(jet);
        tr.commit();
    }
}
