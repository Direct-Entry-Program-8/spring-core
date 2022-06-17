package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Operators {

    public Operators(@Value("#{'ijse'+'esoft'}") String name,
                     @Value("#{10 + 12}") int sum,
                     @Value("#{2 ^ 3}") int value,
                     @Value("#{@nic matches '\\d{9}[Vv]'}") boolean validNIC,
                     @Value("#{(@nic matches '\\d{9}[Vv]')? @nic: 'Invalid NIC'}") String nic,
                     @Value("#{T(lk.ijse.dep8.spring.bean.Operators).getString()?.toUpperCase()}") String someString,
                     @Value("#{T(lk.ijse.dep8.spring.bean.Operators).getString()?: 'Invalid Name'}") String someName) {
        System.out.println(name);
        System.out.println(sum);
        System.out.println(value);
        System.out.println(validNIC);
        System.out.println(nic);
        System.out.println(someString);
        System.out.println(someName);
    }

    public static String getString() {
        return "IJSE";
    }

}
