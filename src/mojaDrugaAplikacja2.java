package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podaj swój wiek w latach:" );
        int age = scanner.nextInt();

        int sec = 60; //minuta w sekundach

        sec = (((sec * 60) * 24) * 365) * age;
        System.out.println("Twój wiek w sekundach: " + sec);

    }
}