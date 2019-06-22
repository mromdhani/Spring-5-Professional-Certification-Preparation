package be.businesstraining.dao;

import be.businesstraining.domain.Department;
import be.businesstraining.domain.Person;

public class DepartmentDao {

    public void save(Department department) {

        System.out.println("Saving Department ...");
    }
     public Department findById(int id) {
        System.out.println("Searching from Department ...");
        return new Department();
    }
}
