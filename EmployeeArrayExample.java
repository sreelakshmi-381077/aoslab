import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double esalary;

    // Method to read employee data
    void readData(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        eno = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        esalary = sc.nextDouble();
    }

    // Method to display employee data
    void displayData() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esalary);
    }
}

public class EmployeeArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Array of objects
        Employee[] emp = new Employee[n];

        // Reading employee information
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            emp[i] = new Employee();  // create object
            emp[i].readData(sc);
        }

        // Search by employee number
        System.out.print("\nEnter employee number to search: ");
        int searchEno = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eno == searchEno) {
                System.out.println("\nEmployee Found:");
                emp[i].displayData();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}