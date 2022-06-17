package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;


@Component
public class TestBean {

    @Value("ijse")
    private String something;

    @Value("true")
    private boolean flag;

    @Value("1500")
    private int age;

    @Autowired
    public void doSomething(@Value("1,2,3,4,5") int[] numbers){
        System.out.println(Arrays.toString(numbers));
    }

    @Autowired
    public void doSomething(@Value("dula, sasitha, chamma") String[] names){
        System.out.println(Arrays.toString(names));
    }

    public TestBean(@Value("3.14") double PI) {
        System.out.println("TestBean() ");
        System.out.println(PI);
    }

    @PostConstruct
    public void init(){
        System.out.println(something);
        System.out.println(flag);
        System.out.println(age);
    }
}
