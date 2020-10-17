import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstname, lastname, socialSecurityNumber;
        double grossSales, commissionRate, baseSalary;
        System.out.print("Enter the count of employees>");
        int size = input.nextInt();
        ArrayList<BasePlusCommissionEmployee> employees = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter data for Employee " + i + 1);
            System.out.print("Enter First name>");
            firstname = input.next();
            System.out.print("Enter Last name> ");
            lastname = input.next();
            System.out.print("Enter Social Security Number> ");
            socialSecurityNumber = input.next();
            System.out.print("Enter Gross Sales> ");
            grossSales = input.nextDouble();
            System.out.print("Enter Commission Rate> ");
            commissionRate = input.nextDouble();
            System.out.print("Enter Base Salary> ");
            baseSalary = input.nextDouble();
            employees.add(new BasePlusCommissionEmployee(firstname, lastname, socialSecurityNumber, grossSales, commissionRate, baseSalary));
            System.out.println();
        }
        printDataEmployees(employees);
    }

    public static void printDataEmployees(ArrayList<BasePlusCommissionEmployee> employees) {
        System.out.println();

        int i = 0;
        for (BasePlusCommissionEmployee employee : employees) {
            System.out.println("Employee:" + (++i) + employee.toString());
            System.out.println("Earnings: " + employee.earnings() + "\n");
        }
    }
}