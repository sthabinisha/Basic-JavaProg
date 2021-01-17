public class TaskSixThree {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
        System.out.println(new Student("Marky"));

    }
}

class Student{

    private String out;

    public Student(String out) {
        this.out = out;
    }

    public Student() {
        this.out = "UnKnown";
    }

    @Override
    public String toString() {
        return "Student{" +
                "out='" + out + '\'' +
                '}';
    }
}
