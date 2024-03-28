package encapsulation;


 class EmployeeTen {
     private String name;
     private String id;
     private String position;
     private double salary;

     public EmployeeTen(String name, String id, String position, double salary) {
         this.name = name;
         this.id = id;
         this.position = position;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public String getId() {

         return id;
     }

     public String getPosition() {
         return position;
     }

     public double getSalary() {
         return salary;
     }
 }
    public class EmployeeRecordsArray {
        public static void main(String[] args) {
            EmployeeTen[] employees = new EmployeeTen[10];

            String[] names = {"John", "Jane", "David", "Emily", "Michael", "Sarah", "Robert", "Jessica", "William", "Laura"};
            String[] ids = {"001", "002", "003", "004", "005", "006", "007", "008", "009", "010"};
            String[] positions = {"Manager", "Engineer", "Salesperson", "Analyst", "Accountant", "HR", "Developer", "Designer", "Consultant", "Administrator"};
            double[] salaries = {50000.0, 60000.0, 45000.0, 55000.0, 70000.0, 48000.0, 65000.0, 52000.0, 58000.0, 53000.0};

            for (int i = 0; i < employees.length; i++) {
                employees[i] = new EmployeeTen(names[i], ids[i], positions[i], salaries[i]);
            }
            String searchId = "005";
            boolean found = false;
            for (EmployeeTen employeeTen : employees) {
                if (employeeTen.getId().equals(searchId)) {
                    System.out.println("\nEmployee details:");
                    System.out.println("Name: " + employeeTen.getName());
                    System.out.println("ID: " + employeeTen.getId());
                    System.out.println("Position: " + employeeTen.getPosition());
                    System.out.println("Salary: " + employeeTen.getSalary());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee with the provided ID does not exist");
            }
        }
    }













