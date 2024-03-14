package pl.pp;

import java.util.Scanner;

public class mojaTrzeciaAplikacja2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Proszę podaj temperaturę w skali Fahrenheit’a: ");

        double fahr = scanner.nextDouble();
        double cel, kel;

        while (true)
        {
            if (fahr == -1) {
                System.out.println("Wyjście...");
                break;
            }
            else {
                cel = (fahr - 32.0) / 1.8;
                kel = cel + 273.16;
                System.out.println("Fahrenheit = " + fahr);
                System.out.println("Celsjusz = " + cel);
                System.out.println("Kelwin = " + kel);

                System.out.println("Wpisz wartość -1 żeby wyjść z programu");
                System.out.print("Proszę podaj temperaturę w skali Fahrenheit’a: ");
                fahr = scanner.nextDouble();
            }
        }
        scanner.close();
    }
}