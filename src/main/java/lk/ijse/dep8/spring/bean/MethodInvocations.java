package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;

//@Component
public class MethodInvocations {

    public MethodInvocations(@Value("#{T(lk.ijse.dep8.spring.bean.MethodInvocations).add(10,20)}") int sum,
                            @Value("#{T(java.util.Calendar).getInstance()}") Calendar calendar,
                             @Value("#{new lk.ijse.dep8.spring.bean.CustomerDTO(500, 'Dulanga')}")  CustomerDTO customerDTO,
                             @Value("#{@helloBean.getNames()}") List<String> names) {
        System.out.println(sum);
        System.out.println(calendar);
        System.out.println(customerDTO.getId());
        System.out.println(customerDTO.getName());
        System.out.println(names);
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
}

class CustomerDTO{
    private int id;
    private String name;

    public CustomerDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
