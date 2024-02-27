import java.util.Scanner;

public class StudentRecordExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // StudentRecord[] students = new StudentRecord[3];
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Student " + (i + 1) + " name: ");
            String name = sc.next();
            students[i].setName(name);

            System.out.print("Student " + (i + 1) + " id: ");
            int id = sc.nextInt();
            students[i].setStudentId(id);

            System.out.print("Student " + (i + 1) + " math grade: ");
            double mathGrade = sc.nextDouble();
            students[i].setMathGrade(mathGrade);

            System.out.print("Student " + (i + 1) + " english grade: ");
            double english = sc.nextDouble();
            students[i].setEnglishGrade(english);

            System.out.print("Student " + (i + 1) + " science grade: ");
            double scienceGrade = sc.nextDouble();
            students[i].setScienceGrade(scienceGrade);

            System.out.println("");
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": Id = " + students[i].getStudentId() + ", Name = "
                    + students[i].getName() + ", Grades = Math: "
                    + students[i].getMathGrade() + ", English: " + students[i].getEnglishGrade() + ", Science: "
                    + students[i].getScienceGrade());
        }
    }
}
