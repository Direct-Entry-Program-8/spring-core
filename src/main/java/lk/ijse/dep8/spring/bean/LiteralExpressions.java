package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class LiteralExpressions {

    public LiteralExpressions(@Value("#{'abc'[1]}") String myString,
                              @Value("#{10}") int value,
                              @Value("#{3.14}") double rate,
                              @Value("#{true}") boolean married) {
        System.out.println("----------");
        System.out.println(myString);
        System.out.println(value);
        System.out.println(rate);
        System.out.println(married);
        System.out.println("----------");
    }
}
