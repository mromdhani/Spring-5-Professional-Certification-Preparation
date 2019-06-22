package be.businesstraining.proxy.jdk;

import be.businesstraining.dao.IPersonDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonDaoInvocationHandler implements InvocationHandler {

    private final IPersonDao target;

    public PersonDaoInvocationHandler(IPersonDao target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>> PRoxied with JDK >>> Before "+ method.getName());
        Object result = method.invoke(target,args);
        System.out.println(">>> PRoxied with JDK >>> After "+ method.getName());
        return result;
    }
}
