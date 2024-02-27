public class Student {
    private String name;
    private String fNumber;
    private Grade[] grades;
    public Student(){
        this.grades = new Grade[5];
    }
    public String getName(){
        return name;
    }
    public String getFacultNumber(){
        return fNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setFacultNumber(String facultyNumber){
        this.fNumber = facultyNumber;
    }

    public void addGrade(Grade grade, int index){
        this.grades[index] = grade;
    }
    public Grade getGrade(int index){
        return this.grades[index];
    }
    public int getGradesCount(){
        return this.grades.length;
    }
}
