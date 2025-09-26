package application;
import entities.Funcionarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class ExercicioPropostoLista {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
        List<Funcionarios> list =  new ArrayList<Funcionarios>();

         for (int i = 1; i <= n; i++) {
             System.out.println();
             System.out.println("Employee #"+ (i)+ ":");
             System.out.print("Id:  ");
             Integer id = sc.nextInt();
             System.out.print("Nome:  ");
             sc.nextLine();
             String nome = sc.nextLine();
             System.out.print("Salary:  ");
             Double salary= sc.nextDouble();

             Funcionarios emp = new Funcionarios(nome, id, salary);

             list.add(emp);

         }

        System.out.println();
        System.out.println("Enter the employee ID that will have salary increase : ");
        int idsalary = sc.nextInt();
        Integer pos = position(list,idsalary);
        if (pos == null){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Enter the employee salary increase : ");
            Double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);

        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Funcionarios emp : list){
            System.out.println(emp);
        }

     sc.close();
    }
            public static Integer position (List<Funcionarios> list, int id){
            for(int i=0;i<list.size();i++){
                if(list.get(i).getId()==id){
                    return i;
                }

            }
return null;
        }

}
