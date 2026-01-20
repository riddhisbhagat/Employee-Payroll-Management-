import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;
    double hra;
    double da;
    double netSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.hra = basicSalary * 0.20;
        this.da = basicSalary * 0.10;
        this.netSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("----------------------------------");
        System.out.println("Employee ID   : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("Net Salary    : " + netSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[10];
        int count = 0;

        while (true) {
            System.out.println("\n--- Employee Payroll Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    emp[count] = new Employee(id, name, salary);
                    count++;

                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records Found!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            emp[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
