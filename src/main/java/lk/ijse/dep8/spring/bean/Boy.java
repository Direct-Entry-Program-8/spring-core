package lk.ijse.dep8.spring.bean;

import lk.ijse.dep8.spring.util.FrenchKiss;
import lk.ijse.dep8.spring.util.Wayasai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component("lahiru")
public class Boy implements ContextInjection{

    @FrenchKiss
    @Wayasai
    @Qualifier("kondea-diga")
    @Autowired
    private GoodGirl primaryGf;

    @Autowired
    private GoodGirl[] arrayOfGoodGirls;

    @Autowired
    public void injectString(@Nullable String someString){
        System.out.println("Injection1: " + someString);
    }

    @Autowired(required = false)
    public void injectString2( String someString){
        System.out.println("Injection2: " + someString);
    }

    @Autowired
    public void smallHack(){
        System.out.println("Small Hack");
    }

    @Autowired
    public void setGoodGirls(List<GoodGirl> goodGirls) {
        System.out.println("Who the heck invoked me?");
        this.goodGirls = goodGirls;
    }

    private List<GoodGirl> goodGirls;

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
        System.out.println("------------------");
        Arrays.stream(arrayOfGoodGirls).forEach(System.out::println);
    }

    /* Interface through injection */
    @Autowired
    @Override
    public void doSomeInjection(Set<GoodGirl> goodGirls) {
        this.goodGirlSet = goodGirls;
    }
}
