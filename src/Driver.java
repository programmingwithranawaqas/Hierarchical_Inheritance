public class Driver {
    public static void main(String[] args) {
        // declaring objects of child classes
        Student stu = new Student(1, "Rana Waqas", 5, 3.59);
        Teacher teacher = new Teacher(200, "Ishfaq Khan", 50000);

        System.out.println(stu.toString());
        System.out.println(teacher.toString());

    }
}
