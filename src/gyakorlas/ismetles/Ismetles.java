package gyakorlas.ismetles;

import java.util.Scanner;

public class Ismetles {

    public static void main(String[] args) throws InterruptedException {
        int szam = 10_000_000;
        String szoveg = "valami szöveg";

        System.out.println("szam=" + szam);
        System.out.println("szoveg=" + szoveg);

        // ......................................

        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";

        boolean jelszoHelyes = false;
        int probalkozasokSzama = 0;
        Scanner scanner = new Scanner(System.in);

        while (!jelszoHelyes) {
            probalkozasokSzama = probalkozasokSzama + 1;
            if (probalkozasokSzama % 4 == 0) {
                System.out.println("tul sok benazas, varjon");
                Thread.sleep(10_000);
                scanner.nextLine();
            }
            System.out.println("probalkozas:" + probalkozasokSzama);
            System.out.print("Ird be a jelszot:" + ANSI_RED);

            String jelszo = scanner.nextLine();

            if (jelszo.hashCode() == 96354) {
                System.out.println("sikeres bejelentkezes" + ANSI_RESET);
                jelszoHelyes = true;
            } else {
                System.out.println("sikertelen bejelentkezes" + ANSI_RESET);
                jelszoHelyes = false;
            }
        }
    }
}
