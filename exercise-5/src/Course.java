public class Course {
    private String name;
    private Student[] students;

    public Course(){
        this.students = new Student[5];
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    
    public Student addStudent(Student student, int index){
        return this.students[index] = student;
    }
    
    public Student getStudent(int index){
        return this.students[index];
    }
    public int getStudentsCount(){
        return this.students.length;
    }
}
