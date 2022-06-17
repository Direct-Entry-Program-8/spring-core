package lk.ijse.dep8.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean("nic")
    public String getNIC(){
        return "12389V";
    }
}
