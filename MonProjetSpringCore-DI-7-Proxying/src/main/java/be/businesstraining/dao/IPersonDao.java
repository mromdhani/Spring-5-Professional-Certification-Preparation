package be.businesstraining.dao;

import be.businesstraining.domain.Person;

public interface IPersonDao {
    void save(Person person);
    Person findById(int id);
}
