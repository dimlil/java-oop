import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course();
        course.setName("Object-oriented programming");
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            System.out.println("Student "+(i+1)+" name:");
            student.setName(scanner.nextLine());
            System.out.println("Student "+(i+1)+" faculty number:");
            student.setFacultNumber(scanner.nextLine());
            course.addStudent(student,i);
        }
        System.out.println("");
        System.out.println("Course: "+course.getName());
        for (int i = 0; i < course.getStudentsCount(); i++) {
            System.out.println("Student "+(i+1)+": Name = "+course.getStudent(i).getName() + ", FN = " + course.getStudent(i).getFacultNumber());
        }
    }
}
