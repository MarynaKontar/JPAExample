package com.app.dao.impl;

import com.app.dao.DAO;
import com.app.model.Animal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by denys on 6/20/2017.
 */
public class JDBCDAOAnimal implements DAO<Animal> {


    public void save(Animal animal) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("INSERT INTO dao_db.animal(name, age) VALUES(?,?)");
            ps.setInt(2, animal.getAge());
            ps.setString(1, animal.getName());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void find(Animal entity) {

    }

    @Override
    public void merge(Animal entity) {

    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/dao_db?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root","123581321lL");
    }
}
