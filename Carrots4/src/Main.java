import javax.swing.*;
import java.util.Arrays;

/**
 * @author Dominik C.
 */
public class Main {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
//
//        System.out.println(dzielenie(1, 2));
//        System.out.println(dzielenie(0, 3));
//        System.out.println(dzielenie(1, 0));
//
//        power(2, 3);
//
//        vargs("tekst", 1,2,3,4);
//        vargs("tekst", 1,2);

//        String imie = JOptionPane.showInputDialog("Podaj imie");
//        System.out.println("Twoje imie to: " + imie);
//        int liczba =  Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe"));
//        System.out.println("liczba = " + liczba);
        System.out.println(silnia(5));
    }

    static int silnia(int num) {
        if (num == 1) {
            return 1;
        }

        return num * silnia(num - 1);
    }

    static double dzielenie(double a, double b) {
        if (b == 0) {
            System.out.println
                    ("NIE DZIEL PRZEZ ZEROOOOO!!!!OOO!!!");
            return -1.0;
        } else {
            return a / b;
        }
    }

    static void power(double a, double b) {
        if (b < 0) {
            System.out.println("zakladamy ze nie podnosimy do potegi < 0");
            return;
        }

        System.out.println("potega = " + Math.pow(a, b));
    }

    static void vargs(String napis, int... vars) {
        for (int i = 0; i < vars.length; i++) {
            System.out.println(napis + vars[i]);
//            System.out.printf();
        }
    }
}
