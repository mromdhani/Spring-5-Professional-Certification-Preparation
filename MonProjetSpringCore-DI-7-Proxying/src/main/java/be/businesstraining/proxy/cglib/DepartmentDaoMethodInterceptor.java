package be.businesstraining.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DepartmentDaoMethodInterceptor  implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("****  Powered By CGLIB  ****  Before "+ method.getName());
        Object result = methodProxy.invokeSuper(object,args);
        System.out.println("****  Powered By CGLIB  ****  After "+ method.getName());
        return result;
    }
}
