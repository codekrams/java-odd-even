package zahleneingabe;

import java.util.Scanner;

public class Zahleneingabe {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte gib eine ganze Zahl ein:");

        int eingabewert = eingabe.nextInt();

        if (eingabewert % 2 == 0) {

            System.out.println(eingabewert + " ist gerade.");

        } else {

            System.out.println(eingabewert + " ist ungerade.");

        }

    }

}