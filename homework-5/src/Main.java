import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student student = new Student();
        System.out.print("Student name: ");
        student.setName(scanner.nextLine());
        System.out.print("Student faculty number: ");
        student.setFacultNumber(scanner.nextLine());

        for (int i = 0; i < 5; i++) {
            Course course = new Course();
            Grade grade = new Grade();
            System.out.print("course: ");
            course.setName(scanner.next());
            grade.setCourse(course);
            
            System.out.print("grade: ");
            grade.setValue(scanner.nextDouble());
            
            student.addGrade(grade, i);
        }
        System.out.println("");
        System.out.println("Student: Name = " + student.getName() + ", FN = " + student.getFacultNumber());

        for (int i = 0; i < student.getGradesCount(); i++) {
            System.out.println("Grade "+(i+1)+": Course = " + student.getGrade(i).getCourse().getName() + ", Value = " + student.getGrade(i).getValue());
        }
    }
}
