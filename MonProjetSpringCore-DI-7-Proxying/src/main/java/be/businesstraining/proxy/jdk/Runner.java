package be.businesstraining.proxy.jdk;

        import be.businesstraining.dao.IPersonDao;
        import be.businesstraining.dao.PersonDao;
        import be.businesstraining.domain.Department;
        import be.businesstraining.domain.Person;

        import java.lang.reflect.Proxy;

public class Runner {
    public static void main(String[] args) {
        System.out.println(" ===== PROXYING using JDK Dynamic Proxies =====");
        IPersonDao personDao = (IPersonDao)
                Proxy.newProxyInstance(IPersonDao.class.getClassLoader(),
                PersonDao.class.getInterfaces(),
                new PersonDaoInvocationHandler(new PersonDao()));
        personDao.save(new Person());
        Person person = personDao.findById(5);
    }
}
