package application;
import entities.Holder;

import java.util.Locale;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Holder x;
        x = new Holder();

        System.out.println("Enter your account number : ");
        x.ac=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your account holder : ");
        x.h=sc.nextLine();

        System.out.println("Is there a initial deposit (y/n) ? ");
        x.init=sc.next().charAt(0);

        if(x.init=='y'){
            System.out.println("Enter the initial deposit: ");
            x.saldo=sc.nextDouble();

        }
        System.out.println("Account data: ");
        System.out.print("Account " + x.ac +", Holder: "+x.h + ", Balance: "+String.format("%.2f",x.saldo) );
        System.out.println();

        System.out.println("Enter a deposit value: ");
        x.deposit=sc.nextDouble();
        x.saldo=x.saldo+ x.deposit;

        System.out.println("Updated account data: ");
        System.out.print("Account " + x.ac +", Holder: "+x.h + ", Balance: "+String.format("%.2f",x.saldo) );
        System.out.println();

        System.out.println("Enter a withdraw value: ");
        x.saque=sc.nextDouble();
        x.saldo=x.saldo- x.saque;

        if(x.saque>0){
            x.saldo -= 5;
        }

        System.out.println("Updated account data: ");
        System.out.print("Account " + x.ac +", Holder: "+x.h + ", Balance: "+String.format("%.2f",x.saldo) );

    }

}
