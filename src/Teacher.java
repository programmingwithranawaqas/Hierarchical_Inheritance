public class Teacher extends Person{
    double salary;

    public Teacher() {
    }

    public Teacher(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString() +
                "salary=" + salary +
                '}';
    }
}
