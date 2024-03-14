package pl.pp;

import java.util.Scanner;
public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Proszę podaj leczbę dni: ");

        int days = scanner.nextInt();
        int weeks;
        int dni;
        while (days >= 0)
        {
            if (days < 7)
                System.out.println(days + " dni to " + days + " dni");
            else if (days >= 7) {
                weeks = days / 7;
                dni = days % 7;
                System.out.println(days + " dni to " + weeks + " tygodnie i " + dni + " dni");
            }
            else break;//wyjście

            System.out.println("Wpisz wartość ujemną żeby wyjść z programu");
            System.out.print("Proszę podaj leczbę dni: ");
            days = scanner.nextInt();
        }
        scanner.close();
    }
}