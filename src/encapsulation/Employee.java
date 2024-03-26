package encapsulation;

public class Employee {
    private int id;
    private String name;
    private String phoneNo;
    private String emailId;
    private String address;
    //Constructor

    public Employee(int id,String name,String phoneNo,String emailId,String address){
        this.id=id;
        this.name=name;
        this.phoneNo=phoneNo;
        this.emailId=emailId;
        this.address=address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //Method
    public void displayDetails(){
        System.out.println("Employee Detils: ");
        System.out.println("ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Phone No " +phoneNo);
        System.out.println("Email ID: " +emailId);
        System.out.println("Address: " +address);
    }
    //Main

    public static void main(String[] args) {
        Employee employee= new Employee(1,"John","1234567890","john.d@gmail.com", "123 Street");
        employee.displayDetails();
        employee.setPhoneNo("9884672196");
        employee.displayDetails();
    }
}
