package lk.ijse.dep8.spring.bean;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

    public List<Student> findAllStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dulanga", "Matara"));
        students.add(new Student(2, "Chamma", "Moratuwa"));
        students.add(new Student(3, "Sasitha", "Kurunagala"));
        students.add(new Student(4, "Admin", "Matara"));
        students.add(new Student(5, "Thilina", "Moratuwa"));
        return students;
    }
}
