//Pojo class for student details
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String dob;
    private String course;
    private int courseStartYear;
    private int courseEndYear;
    private List<Subject> subjects;

    public Student(int id, String name, int age, String gender, String dob, String course, int courseStartYear, int courseEndYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
        this.course = course;
        this.courseStartYear = courseStartYear;
        this.courseEndYear = courseEndYear;
        this.subjects = new ArrayList<>();  //arraylist for subject which stores student subject and marks
    }

    public void addSubject(Subject subject) { //we are adding subject and marks to this method 
        this.subjects.add(subject);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getCourse() {
        return course;
    }

    public int getCourseStartYear() {
        return courseStartYear;
    }

    public int getCourseEndYear() {
        return courseEndYear;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    }

