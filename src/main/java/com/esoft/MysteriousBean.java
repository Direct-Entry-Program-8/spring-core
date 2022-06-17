package com.esoft;

import lk.ijse.dep8.spring.MyCondition;
import org.springframework.context.annotation.Conditional;

public class MysteriousBean {

    public MysteriousBean() {
        System.out.println("I am crazy, you know...?");
    }
}
