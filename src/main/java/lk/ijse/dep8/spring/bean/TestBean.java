package lk.ijse.dep8.spring.bean;

import lk.ijse.dep8.spring.MyCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Conditional(MyCondition.class)
@Component
public class TestBean {

    public TestBean() {
        System.out.println("TestBean()");
    }
}
