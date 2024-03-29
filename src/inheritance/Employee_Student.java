package inheritance;

class Person{
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    //Constructor
    public Person(int id,String name,String phone,String email,String address){
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.address=address;
    }
    //getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
class Employee extends Person{
    private double salary;
    private String department;
    private String dateOfJoining;
    //constructor
    public Employee(int id,String name,String phone,String email,String address,double salary, String department, String dateOfJoining){
        super(id,name,phone,email,address);
        this.salary=salary;
        this.department=department;
        this.dateOfJoining=dateOfJoining;
    }
    //Getter

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }
}
class Student extends Person{
    private String course;
    private int year;
    public Student(int id, String name, String phone, String email, String address,
                   String course, int year) {
        super(id, name, phone, email, address);
        this.course = course;
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }
}
public class Employee_Student {
    public static void main(String[] args) {
        Employee employee=new Employee(1, "John Doe", "1234567890", "john@example.com", "123 Main St",
                50000.0, "IT Department", "2022-01-01");
        Student student=new Student(1001, "Jane Smith", "9876543210", "jane@example.com", "456 Elm St",
                "Computer Science", 2);
        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Phone: " + employee.getPhone());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Date of Joining: " + employee.getDateOfJoining());

        System.out.println();

        // Display details of the Student
        System.out.println("Student Details:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Phone: " + student.getPhone());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Year: " + student.getYear());
    }

}
