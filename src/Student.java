public class Student extends Person {
    int semester;
    double gpa;

    public Student(int id, String name, int semester, double gpa) {
        super(id, name);
        this.semester = semester;
        this.gpa = gpa;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "semester=" + semester +
                ", gpa=" + gpa +
                '}';
    }
}
