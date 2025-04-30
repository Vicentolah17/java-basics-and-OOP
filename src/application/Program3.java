package application;
import entities.Employe;
import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employe emp = new Employe();


        System.out.print("Enter the Employee Data: ");
        System.out.println();
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.print("Employee: "+emp.name+ ", $ " +emp.netSalary());
        System.out.println();
        System.out.println("Which percentage do you want increase salary?");
        emp.percentage = sc.nextDouble();

        emp.increaseSalary();

        System.out.println("Update data: "+emp.name+ ", $ " +emp.netSalary());



    }
}