package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Qualifier("kondea-diga")
@Primary
@Component
public class Piumi implements GoodGirl{
    @Override
    public void kiss() {
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmmmmmmmmaaaaaa....!");
    }
}
