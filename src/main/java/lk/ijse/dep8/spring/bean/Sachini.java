package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("sudui")
@Primary
@Component
public class Sachini implements GoodGirl{
    @Override
    public void kiss() {
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmmmmma....!");
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmmmmma....!");
    }
}
