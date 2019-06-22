package be.businesstraining.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class MySingletonBean {

    @Autowired
    private MyPrototypeBean prototypeBean;

    public void showMessage(){
        MyPrototypeBean bean = getPrototypeBean();
        System.out.println("Hi, the time is "+bean.getDateTime());
    }

    @Lookup
    public MyPrototypeBean getPrototypeBean(){
        //spring will "PROXY" this method
       // return prototypeBean;
        return null;
    }
}