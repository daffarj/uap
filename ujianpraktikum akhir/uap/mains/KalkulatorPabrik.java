package uap.mains;

import java.util.Scanner;
import uap.models.*;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Daffa Ramadhan Jauhari");
        System.out.println("245150700111032");
        System.out.println("==================================");
        System.out.println("Donat dengan lubang");
        System.out.println("==================================");
        System.out.print("Masukan Radius: ");
        double Radius = input.nextDouble();
        System.out.print("Masukan radius: ");
        double radius = input.nextDouble();
        System.out.println("==================================");
        Torus torus = new Torus(Radius, radius);
        torus.printinfo();
        System.out.println("Massa dalam kg: " + torus.gramToKilogram());
        System.out.println("Biaya Kirim: Rp." + torus.calculateCost());
        System.out.println("==================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("==================================");
        System.out.print("Masukan radius: ");
        double radius2 = input.nextDouble();
        System.out.println("==================================");
        Sphere sphere = new Sphere(radius2);
        sphere.printinfo();
        System.out.println("Massa dalam kg: " + sphere.gramToKilogram());
        System.out.println("Biaya Kirim: Rp." + sphere.calculateCost());
        System.out.println("==================================");

        input.close();
    }
}


