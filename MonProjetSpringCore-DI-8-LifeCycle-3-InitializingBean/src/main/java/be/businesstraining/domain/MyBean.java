package be.businesstraining.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;


public class MyBean implements InitializingBean, DisposableBean {
    private OtherBean otherBean;

    public MyBean() {
        System.out.println("MyBean constructor: " + this);
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()");
    }


    @Autowired
    public void setOtherBean(OtherBean otherBean) {
        System.out.println("setOtherBean(): " + otherBean);
        this.otherBean = otherBean;
    }

    public void doSomething() {
        System.out.println("doSomething()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy() method");
    }

}