package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.util.Calendar;

@Component
public class SpringBean {

    @Autowired(required = false)
    public SpringBean(Calendar c){
        System.out.println("SpringBean(Integer,String)");
    }

    @Autowired(required = false)
    public SpringBean(Connection c){
        System.out.println("SpringBean(Connection)");
    }

    public SpringBean() {
        System.out.println("SpringBean()");
    }

    @PostConstruct
    public void init() {
        System.out.println("SpringBean: Init() method");
    }
}
