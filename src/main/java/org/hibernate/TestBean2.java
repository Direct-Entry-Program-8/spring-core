package org.hibernate;

import lk.ijse.dep8.spring.MyCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Conditional(MyCondition.class)
@Component
public class TestBean2 {

    public TestBean2() {
        System.out.println("Test Bean 2");
    }
}
