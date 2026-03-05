import java.util.Scanner;

class Employee {
    int empid;
    String name;
    double salary;
    String address;

    Employee(int id, String n, double s, String addr) {
        empid = id;
        name = n;
        salary = s;
        address = addr;
    }
}

class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int id, String n, double s, String addr, String dept, String sub) {
        super(id, n, s, addr);
        department = dept;
        subject = sub;
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
        System.out.println("-----------------------");
    }
}

public class Main 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter details of teacher " + (i + 1));

            System.out.print("Emp ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address: ");
            String addr = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject: ");
            String sub = sc.nextLine();

            t[i] = new Teacher(id, name, salary, addr, dept, sub);
        }

        System.out.println("\nTeacher Details");

        for (int i = 0; i < n; i++) {
            t[i].display();
        }
    }
}