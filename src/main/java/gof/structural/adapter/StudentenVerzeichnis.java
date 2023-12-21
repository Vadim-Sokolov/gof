package gof.structural.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentenVerzeichnis {
    private static final List<Student> students = new ArrayList<>();

    public Optional<Student> holenSieSichDenNamenDesSchulers(String namen) {
        return students.stream()
                .filter(s -> namen.equals(s.getName()))
                .findFirst();
    }

    public List<Student> holenSieSichStudentenNachFakultat(String facultat) {
        return students.stream()
                .filter(s -> facultat.equals(s.getFaculty()))
                .collect(Collectors.toList());
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
