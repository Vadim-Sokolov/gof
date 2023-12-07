package gof.structural.adapter;

public class Student {

    private String name;
    private String faculty;
    private Integer grade;

    public Student(String name, String faculty, Integer grade) {
        this.name = name;
        this.faculty = faculty;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
