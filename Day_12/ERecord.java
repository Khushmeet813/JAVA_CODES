package Day_12;

import java.util.Scanner;

// Practical 1: Employee Record with Constructor Overloading

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee() {
        id = 0;
        name = "Default record created";
        department = "Bench";
        salary = 0.0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        department = "Unassigned";
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        if (id == 0 && salary == 0.0) {
            System.out.println("Employee 1: " + name);
        } else if (department.equals("Unassigned")) {
            System.out.printf("Employee 2: %s, Rs. %.2f%n", name, salary);
        } else {
            System.out.printf("Employee 3: %d, %s, %s, Rs. %.2f%n",
                    id, name, department, salary);
        }
    }
}

public class ERecord{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Employee e2 = new Employee(name, salary);

        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary2 = sc.nextDouble();

        Employee e3 = new Employee(id, name2, dept, salary2);

        System.out.println();
        e1.display();
        e2.display();
        e3.display();

        sc.close();
    }
}