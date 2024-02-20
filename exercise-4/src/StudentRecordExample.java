import java.util.Scanner;

public class StudentRecordExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentRecord[] students = new StudentRecord[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = new StudentRecord();
            System.out.print("Student " + (i + 1) + " name: ");
            String name = sc.next();
            students[i].setName(name);

            System.out.print("Student " + (i + 1) + " faculty number: ");
            String fNum = sc.next();
            students[i].setFacultyNumber(fNum);

            System.out.print("Student " + (i + 1) + " math grade: ");
            double mathGrade = sc.nextDouble();
            students[i].setMathGrade(mathGrade);

            System.out.print("Student " + (i + 1) + " informatics grade: ");
            double informaticsGrade = sc.nextDouble();
            students[i].setInformaticsGrade(informaticsGrade);
            System.out.println("");
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " Name " + students[i].getName() + ", FN"
                    + students[i].getFacultyNumber() + ", Average = " + students[i].getAverage());
        }
    }
}
