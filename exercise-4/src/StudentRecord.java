public class StudentRecord {
    private String name;
    private String facultyNumber;
    private double mathGrade;
    private double informaticsGrade;

    public String getName() {
        return name;
    }
    public String getFacultyNumber() {
        return facultyNumber;
    }
    public double getMathGrade() {
        return mathGrade;
    }
    public double getInformaticsGrade() {
        return informaticsGrade;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }
    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }
    public void setInformaticsGrade(double informaticsGrade) {
        this.informaticsGrade = informaticsGrade;
    }
    
    public double getAverage() {
        double result = 0;
        result = (mathGrade + informaticsGrade) / 2;
        return result;
    }
}
