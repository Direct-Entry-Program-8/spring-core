package lk.ijse.dep8.spring.bean;

import lk.ijse.dep8.spring.util.FrenchKiss;
import lk.ijse.dep8.spring.util.Wayasai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("lahiru")
public class Boy {

    @FrenchKiss
    @Wayasai
    @Qualifier("kondea-diga")
    @Autowired
    private GoodGirl gf;

    public Boy() {
        System.out.println(gf);
    }

    @PostConstruct
    public void init() {
        System.out.println(gf);
        gf.kiss();
    }
}
