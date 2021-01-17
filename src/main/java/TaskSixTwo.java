import java.util.ArrayList;

public class TaskSixTwo {
    public static void main(String[] args) {
        ArrayList<Employee> emplyee= new ArrayList<>();
        emplyee.add(new Employee("Robert", 2000,"64C- Walls Streat" ));
        emplyee.add(new Employee("Sam", 2000,"64C- Walls Streat" ));

        emplyee.add(new Employee("John", 2000,"64C- Walls Streat" ));
        for (int i = 0; i < emplyee.size(); i++) {
            System.out.println(emplyee.get(i).getName() + "  "+ emplyee.get(i).getYear()+ " "+ emplyee.get(i).getAddress());

        }



    }
}

class Employee{
    private String name;
    private int year;
    private String address;

    public Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
