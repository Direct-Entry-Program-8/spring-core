package lk.ijse.dep8.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public String aString(){
        return "IJSE";
    }

//    @Bean
//    public Integer anInt(){
//        return 10;
//    }
}
