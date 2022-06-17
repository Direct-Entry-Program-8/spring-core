package lk.ijse.dep8.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Operators2 {

    public Operators2(@Value("#{@studentService.findAllStudents().?[getAddress() eq 'Moratuwa']}") List<Student> students,
                      @Value("#{@studentService.findAllStudents().![getName()]}") List<String> names) {
        students.forEach(System.out::println);
        System.out.println("-----------");
        names.forEach(System.out::println);
    }
}
