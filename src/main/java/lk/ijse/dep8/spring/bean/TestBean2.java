package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class TestBean2 {

    @Value("${PATH}")
    private String PATH;

    @Value("${app.profiles.active}")
    private String profile;

    @Autowired
    private void doCreateTempFile(@Value("${java.io.tmpdir}") String tempDir){
        System.out.println(tempDir);
    }

    @PostConstruct
    public void init(){
        System.out.println(PATH);
        System.out.println(profile);
    }
}
