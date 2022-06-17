package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

//@Component
public class ListExpressions {

    public ListExpressions(@Value("#{{1,2,3,4,5}}") List<Integer> numbers,
                           @Value("#{{{'ijse', 'esoft'}, {'nsbm','nibm'}}}") List<List<String>> names,
                           @Value("#{{'ijse', false, 10, 12.25}}") List<?> values,
                           @Value("#{{1,2,3,4,5}[1]}") int secondValue,
                           @Value("#{{{'ijse', 'esoft'}, {'nsbm','nibm'}}[1]}") List<String> schools,
                           @Value("#{{1,2,3,4,5,5}}") Set<Integer> setOfInts) {

        System.out.println(numbers);
        System.out.println(names);
        System.out.println(values);
        System.out.println(secondValue);
        System.out.println(schools);
        System.out.println(setOfInts);
    }
}
