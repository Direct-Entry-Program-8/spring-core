package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("kondea-diga")
@Primary
@Component
public class Piumi implements GoodGirl{
    @Override
    public void kiss() {
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmmmmmmmmaaaaaa....!");
    }
}
