package application;
import entities.Rectangle;


import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

        System.out.println("Enter rectangle wight and height:");
        r.w=sc.nextDouble();
        r.h=sc.nextDouble();


        System.out.printf("AREA = "+r.area());
        System.out.println();
        System.out.printf("PERIMETER = "+r.perimeter());
        System.out.println();
        System.out.printf("DIAGONAL = "+r.diagonal());



    }
}
