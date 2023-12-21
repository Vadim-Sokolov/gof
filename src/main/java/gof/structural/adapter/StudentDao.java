package gof.structural.adapter;

import java.util.List;
import java.util.Optional;

public interface StudentDao {

    Optional<Student> getStudentByName(String name);

    List<Student> getStudentByFaculty(String faculty);
}
