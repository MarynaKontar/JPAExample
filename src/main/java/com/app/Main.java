package com.app;

import com.app.dao.DAO;
import com.app.dao.impl.*;
import com.app.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by denys on 6/20/2017.
 */
public class Main {

    public static void main(String[] args) {
//        DAO dao = new JDBCDAOAnimal();
        DAO<Animal> daoAnimal = new JPADAOAnimal();
        DAO<Cat> daoCat = new JPADAOCat();
        DAO<Car> daoCar = new JPADAOCar();
        DAO<Child> daoChild = new JPADAOChild();
        DAO<ChildA> daoChildA = new JPADAOChildA();
        DAO<Company> daoCompany = new JPADAOCompany();
        DAO<Computer> daoComputer = new JPADAOComputer();
        DAO<Department> daoDepartment = new JPADAODepartment();
        DAO daoDog = new JPADAODog();


        Animal a = new Animal();
        a.setName("Ant");
        a.setAge(1);

        Animal a1 = new Animal();
        a1.setName("Monkey");
        a1.setAge(4);

//        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(a);
//        em.getTransaction().commit();
        daoAnimal.save(a1);
        daoAnimal.save(a);



        Dog dog = new Dog();
        dog.setColorType(ColorType.BLACK);
        dog.setFeight(2.4f);
        dog.setName("Dog1");

        Cat cat = new Cat();
        cat.setName("N1");
        cat.setColorType(ColorType.GREEN);
        cat.setAge(1);

        Cat cat2 = new Cat();
        cat2.setName("N1");
        cat2.setColorType(ColorType.BLUE);
        cat2.setAge(2);

        Car car = new Car();
        car.setName("C1");
        Engine engine = new Engine();
        engine.setVolume(2.0f);
        engine.setEngineName("Eng1");
        car.setEngine(engine);

        ComputerKey key = new ComputerKey();
        key.setPrice(1);
        key.setTitle("T1");

        Computer computer = new Computer();
        computer.setManufactor("M1");
        computer.setComputerKey(key);


        Dog dog1 = new Dog();
        dog1.setName("MyDog1");
        dog1.setColorType(ColorType.RED);



        Dog dog2 = new Dog();
        dog2.setId(11);
        dog2.setName("UPDATEDOG");

        ComputerKey key1 = new ComputerKey();
        key1.setPrice(1);
        key1.setTitle("T1");

        Animal animal2 = new Animal();
        animal2.setName("A1");
        animal2.setAge(1);

//        Parent parent = new Parent();
//        parent.setName("P1");

        Child child = new Child();
        child.setName("Ch1");
        child.setSecondName("Ch1.SecondName1");

        ChildA childA = new ChildA();
        childA.setName("ChildA");
        childA.setAge(10);

        Department department1 = new Department();
        department1.setDepartmentName("D1");
        Department department2 = new Department();
        department2.setDepartmentName("D2");
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department1);
        departmentList.add(department2);


        Company company = new Company();
        company.setCompanyName("C1");
        company.setDepartments(departmentList);
        department1.setCompany(company);
        department2.setCompany(company);


        Animal animal3 = new Animal();
        animal3.setAge(1);
        animal3.setName("N1");

        Animal animal4 = new Animal();
        animal4.setAge(2);
        animal4.setName("N2");

    }

}
