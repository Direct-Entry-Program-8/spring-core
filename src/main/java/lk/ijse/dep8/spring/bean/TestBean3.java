package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean3 {

    public TestBean3(@Value("${app.log.level}") String logLevel,
                     @Value("${app.user.name}") String userName,
                     @Value("${app.user.password}") String password,
                     @Value("${hibernate.connection.url}") String url){
        System.out.println(logLevel);
        System.out.println(userName);
        System.out.println(password);
        System.out.println(url);
    }
}
