package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpringBean {


    public SpringBean(String something, @Autowired(required = false) Integer i) {
        System.out.println("SpringBean() " + something + " " + i);
    }

//    @Autowired
//    public void doSomething(@Autowired(required = false) Integer something){
//        System.out.println(something);
//    }

    @PostConstruct
    public void init(){
        System.out.println("SpringBean: Init() method");
    }
}
