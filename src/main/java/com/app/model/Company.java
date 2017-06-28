package com.app.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by User on 22.06.2017.
 */
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String companyName;
    /*own side
    mappBy is not on ownside of relationship
     */
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "company" )
    private List<Department> departments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
