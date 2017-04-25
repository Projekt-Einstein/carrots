package zajecia4;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Dominik C.
 */
public class Zadanie4 {

    public static void main(String[] args) {
        // wczytwywanie z argumentow linii polecen
        if (args.length > 0) {
            System.out.println("Z linii polecen: " + isNumber(args[0]));
        }

        //JOptionPane
        String input = JOptionPane.showInputDialog(null, "Wprowadz tekst do sprawdzenia");

        if (input != null) {
            System.out.println("JOptionPane: " + isNumber(input));
        }

        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz tekst: ");
        input = scanner.nextLine();
        System.out.println("Scanner: " + isNumber(input));

    }

    private static boolean isNumber(String text) {
        for (char ch : text.toCharArray()) {
            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }

}
