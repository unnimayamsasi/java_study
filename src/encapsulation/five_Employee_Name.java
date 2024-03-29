package encapsulation;
import encapsulation.EmployeeTen;

public class five_Employee_Name {
    public static void main(String[] args) {
        EmployeeTen[] employees = new EmployeeTen[5];
        String[] names = {"John", "Jane", "David", "Emily", "Michael"};
        String[] ids = {"001", "002", "003", "004", "005"};
        String[] positions = {"Manager", "Engineer", "Salesperson", "Analyst", "Accountant"};
        double[] salaries = {50000.0, 60000.0, 45000.0, 55000.0, 70000.0};

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new EmployeeTen(names[i], ids[i], positions[i], salaries[i]);
        }
        String searchName = "David";
        boolean found = false;
        for (EmployeeTen employee : employees) {
            if (employee.getName().equals(searchName)) {
                System.out.println("Employeee fond");
                System.out.println("Name : " + employee.getName());
                System.out.println("ID: " + employee.getId());
                System.out.println("Position: " + employee.getPosition());
                System.out.println("Salary: " + employee.getSalary());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found");
        }

    }
}

