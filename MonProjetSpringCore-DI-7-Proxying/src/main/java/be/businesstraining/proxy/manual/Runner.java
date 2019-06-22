package be.businesstraining.proxy.manual;

import be.businesstraining.dao.IPersonDao;
import be.businesstraining.dao.PersonDao;
import be.businesstraining.domain.Person;

/**
 * Hello world!
 *
 */
//@org.springframework.context.annotation.Configuration
public class Runner
{
    public static void main( String[] args )
    {
        System.out.println(" ===== PROXYING Manually =====");
       IPersonDao dao = new PersonDaoProxy(new PersonDao());
       dao.save(new Person());
       Person person = dao.findById(0);
    }
}
