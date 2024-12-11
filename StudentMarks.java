//main class
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {  //main program starts
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        List<Student> students = new ArrayList<>();  //contains id,name,age,gender,dob,course,course start year and end year..subjects and their marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter student gender: ");
            String gender = scanner.nextLine();
            System.out.print("Enter student DOB: ");
            String dob = scanner.nextLine();
            System.out.print("Enter student course: ");
            String course = scanner.nextLine();
            System.out.print("Enter course start year: ");
            int courseStartYear = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter course end year: ");
            int courseEndYear = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); 
            Student student = new Student(id, name, age, gender, dob, course, courseStartYear, courseEndYear); //student object to obtain student details
            for (int j = 0; j < numSubjects; j++) { //loop to iterate subjects list if subjects are morethan 0
                System.out.print("Enter subject name: ");
                String subjectName = scanner.nextLine();
                System.out.print("Enter subject marks: ");
                int subjectMarks = scanner.nextInt();
                scanner.nextLine(); 
                Subject subject = new Subject(subjectName, subjectMarks); //Subject object for subjects and marks
                student.addSubject(subject); //addSubject method called to pass subjects and marks
            }
            students.add(student);  //and lastly we are adding student details in list
        }
        System.out.println("ID   Name             Age    Gender     DOB              Course      Course Start Year     Course End Year   Marks"); //titles according to values will be printing in output
        for (Student student : students) {  //iterating student list to print student details
            System.out.printf("%-5d %-15s %-5d %-10s %-15s %-15s %-20d %-15d", 
                student.getId(), student.getName(), student.getAge(), student.getGender(), 
                student.getDob(), student.getCourse(), student.getCourseStartYear(), 
                student.getCourseEndYear());
            for (Subject subject : student.getSubjects()) {
                System.out.printf(" %-15s", subject.getName() + ": " + subject.getMarks());
            }
            System.out.println();
        }

        scanner.close();
    }
}


