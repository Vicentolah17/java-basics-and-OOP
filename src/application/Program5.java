package application;
import entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent [] vect = new Rent[10];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String namee = sc.nextLine();
            System.out.print("Email: ");
            String emaill =sc.next();
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();

            vect [roomNumber] = new Rent(namee,emaill);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i<10; i++){
            if(vect[i]!=null){
                System.out.println(i + ":" + vect[i]);
            }
        }

        sc.close();
    }
}
