package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

//@Component
public class MapExpressions {

    public MapExpressions(@Value("#{{'abc':10,'edf':20, 'zzz': 30}}") Map<String, Integer> integerMap) {
        System.out.println(integerMap);
    }
}
