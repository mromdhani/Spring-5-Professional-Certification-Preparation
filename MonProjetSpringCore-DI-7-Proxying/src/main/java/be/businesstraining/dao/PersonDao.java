
package be.businesstraining.dao;

import be.businesstraining.domain.Person;

//@Component
public class PersonDao implements IPersonDao {
    @Override
    public void save(Person person) {

        System.out.println("Saving Person ...");
    }

    @Override
    public Person findById(int id) {
        System.out.println("Searching from Person ...");
        return new Person();
    }
}

