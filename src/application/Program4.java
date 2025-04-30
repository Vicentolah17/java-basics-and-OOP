package application;
import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        a.nome = sc.nextLine();
        System.out.println("Digite a nota do Primeiro Trimestre: ");
        a.nota1=sc.nextDouble();
        System.out.println("Digite a nota do Segundo Trimestre: ");
        a.nota2=sc.nextDouble();
        System.out.println("Digite a nota do Terceiro Trimestre: ");
        a.nota3=sc.nextDouble();

        System.out.println("Nota Final: " + String.format("%.2f", a.notageral()));
        if(a.notageral()>=60){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
        sc.close();



    }
}
