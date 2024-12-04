package Exercices;

import java.util.Locale;
import java.util.Scanner;
import Entities.Valor;

public class Rectangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Valor x;
        x= new Valor();

        System.out.print("Enter width and height: ");

        x.width = sc.nextDouble();
        x.height = sc.nextDouble();



        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);

                sc.close();
    }
}
