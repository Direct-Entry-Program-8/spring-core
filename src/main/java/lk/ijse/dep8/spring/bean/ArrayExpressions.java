package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

//@Component
public class ArrayExpressions {

    @Value("#{new int[]{10,20,30,40}}")
    private int[] numbers;

    @Value("#{new String[5]}")
    private String[] names;

    @Value("#{new int[5][5]}")
    private int[][] coordinates;

    @PostConstruct
    public void init(){
        System.out.println(Arrays.toString(numbers));
        System.out.println(names.length);
        System.out.println(coordinates.length);
        System.out.println(coordinates[0].length);
    }
}
