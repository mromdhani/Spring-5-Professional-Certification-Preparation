package be.businesstraining.proxy.manual;

import be.businesstraining.dao.IPersonDao;
import be.businesstraining.dao.PersonDao;
import be.businesstraining.domain.Person;

public class PersonDaoProxy  implements IPersonDao {

    private final PersonDao personDao;

    public PersonDaoProxy(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void save(Person person) {
        System.out.println("Before save()");
        personDao.save(person);
        System.out.println("After save()");
   }

    @Override
    public Person findById(int id) {
        System.out.println("Before findById()");
        Person person = personDao.findById(id);
        System.out.println("After findById()");
        return  person;

    }
}
