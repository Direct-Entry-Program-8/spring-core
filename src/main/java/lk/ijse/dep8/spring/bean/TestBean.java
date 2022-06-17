package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestBean {

    @Autowired
    private Environment env;

    public TestBean(@Value("${app.log.level}") String logLevel,
                    @Value("${app.user.name}") String userName,
                    @Value("${PATH}") String path) {
        System.out.println(logLevel);
        System.out.println(userName);
        System.out.println("--------------");
    }

    @PostConstruct
    private void init(){
        System.out.println(env.getProperty("app.log.level"));//null
        System.out.println(env.getRequiredProperty("app.log.level"));
        System.out.println(env.getProperty("app.user.name"));
        System.out.println(env.getProperty("PATH"));
        System.out.println(env.getProperty("java.io.tmpdir"));
    }
}
