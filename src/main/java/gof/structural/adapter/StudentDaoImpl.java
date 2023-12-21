package gof.structural.adapter;

import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao {

    private final StudentenVerzeichnis studentRepository;

    public StudentDaoImpl(StudentenVerzeichnis studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> getStudentByName(String name) {
        return studentRepository.holenSieSichDenNamenDesSchulers(name);
    }

    @Override
    public List<Student> getStudentByFaculty(String faculty) {
        return studentRepository.holenSieSichStudentenNachFakultat(faculty);
    }
}
