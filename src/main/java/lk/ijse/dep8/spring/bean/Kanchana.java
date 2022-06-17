package lk.ijse.dep8.spring.bean;

import lk.ijse.dep8.spring.util.Wayasai;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Wayasai
@Qualifier("kondea-diga")
@Primary
@Component
public class Kanchana implements GoodGirl{

    @Override
    public void kiss() {
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmaaaa");
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmaaaa");
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmaaaa");
    }
}
