package gof.structural.adapter;

import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao {

    private final StudentenVerzeichnis studentManager;

    public StudentDaoImpl(StudentenVerzeichnis studentManager) {
        this.studentManager = studentManager;
    }

    @Override
    public Optional<Student> getStudentByName(String name) {
        return studentManager.HolenSieSichDenNamenDesSchulers(name);
    }

    @Override
    public List<Student> getStudentByFaculty(String faculty) {
        return studentManager.HolenSieSichStudentenNachFakultat(faculty);
    }
}
