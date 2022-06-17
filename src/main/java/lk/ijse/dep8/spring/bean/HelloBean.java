package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloBean {

    @Value("#{{'Kamal', 'Dulanga', 'Sunil', 'Kasun', 'Thilina', 'Kasuni', 'Kawmal'}}")
    private List<String> names;

    public List<String> getNames(){
        return names;
    }
}
