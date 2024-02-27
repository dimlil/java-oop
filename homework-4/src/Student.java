public class Student extends StudentRecord {
    private StudentRecord studentRecord;
    private int studentId;
    
    public StudentRecord getStudentRecord() {
        return studentRecord;
    }
    
    public void setStudentRecord(StudentRecord studentRecord) {
        this.studentRecord = studentRecord;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}