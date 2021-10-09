package gyakorlas.ismetles;

public class Ciklusok {

    public static void main(String[] args) {
        for (int hanyadik = 1; hanyadik <= 10; hanyadik = hanyadik + 1) {
            System.out.println(hanyadik);
        }

        int szam = 10;
        while (szam > 0) {
            System.out.println("szam:" + szam);
            szam = szam - 1;
        }
    }
}
