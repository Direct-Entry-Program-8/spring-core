package lk.ijse.dep8.spring.bean;

import lk.ijse.dep8.spring.util.FrenchKiss;
import lk.ijse.dep8.spring.util.Wayasai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component("lahiru")
public class Boy {

    @FrenchKiss
    @Wayasai
    @Qualifier("kondea-diga")
    @Autowired
    private GoodGirl primaryGf;

    @Autowired
    private List<GoodGirl> goodGirls;

    @Autowired
    private Set<GoodGirl> goodGirlSet;

    @Autowired
    private Map<String, GoodGirl> goodGirlMap;

    public Boy() {
        System.out.println(primaryGf);
    }

    @PostConstruct
    public void init() {
        System.out.println(primaryGf);
        primaryGf.kiss();

        goodGirls.forEach(System.out::println);
        System.out.println("----------------");
        goodGirlSet.forEach(System.out::println);
        System.out.println("-----------------");
        for (String key : goodGirlMap.keySet()) {
            System.out.printf("%s:%s\n", key, goodGirlMap.get(key));
        }
    }
}
