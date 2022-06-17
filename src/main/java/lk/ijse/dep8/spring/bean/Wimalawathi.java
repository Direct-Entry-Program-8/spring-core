package lk.ijse.dep8.spring.bean;

import lk.ijse.dep8.spring.util.FrenchKiss;
import lk.ijse.dep8.spring.util.Wayasai;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@FrenchKiss
@Wayasai
@Primary
@Qualifier("kondea-diga")
@Component
public class Wimalawathi implements GoodGirl{
    @Override
    public void kiss() {
        System.out.println("Ummmmma.....!");
        System.out.println("Ummmmma.....!");
        System.out.println("Ummmmma.....!");
        System.out.println("Ummmmma.....!");
        System.out.println("Ummmmma.....!");
        System.out.println("Ummmmma.....!");
        System.out.println("French Kiss....!");
    }
}
