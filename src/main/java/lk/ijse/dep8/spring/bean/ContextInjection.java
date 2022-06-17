package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public interface ContextInjection {

    void doSomeInjection(Set<GoodGirl> goodGirls);
}
