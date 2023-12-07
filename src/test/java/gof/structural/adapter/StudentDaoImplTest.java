package gof.structural.adapter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDaoImplTest {

    private static final StudentenVerzeichnis manager = new StudentenVerzeichnis();
    private final StudentDaoImpl dao = new StudentDaoImpl(manager);

    @BeforeAll
    static void setUp() {
        manager.addStudent(new Student("Gary", "History", 5));
        manager.addStudent(new Student("Becca", "History", 7));
        manager.addStudent(new Student("Bob", "Math", 6));
        manager.addStudent(new Student("Lola", "Math", 7));
        manager.addStudent(new Student("Gary", "Chemistry", 10));
    }

    @Test
    void findByName_shouldReturnCorrectStudent() {
        // GIVEN
        var expected = "Becca";

        // WHEN
        var actual = dao.getStudentByName(expected);

        // THEN
        assertEquals(expected, actual.get().getName());
    }

    @Test
    void findByFaculty_shouldReturnCorrectStudentList() {
        // GIVEN
        var faculty = "Math";
        var expected = 2;

        // WHEN
        var actual = dao.getStudentByFaculty(faculty);

        // THEN
        assertEquals(expected, actual.size());
    }

    @Test
    void findByName_shouldReturnEmptyOptional() {
        // GIVEN
        var expected = "Roxane";

        // WHEN
        var actual = dao.getStudentByName(expected);

        // THEN
        assertTrue(actual.isEmpty());
    }

    @Test
    void findByFaculty_shouldReturnEmptyList() {
        // GIVEN
        var faculty = "Biology";

        // WHEN
        var actual = dao.getStudentByFaculty(faculty);

        // THEN
        assertTrue(actual.isEmpty());
    }
}