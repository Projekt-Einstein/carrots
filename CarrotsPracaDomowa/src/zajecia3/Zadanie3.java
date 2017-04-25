package zajecia3;

import java.util.Scanner;

/**
 * @author Dominik C.
 */
public class Zadanie3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String next = scanner.nextLine();

        while (!next.equals("end")) {
            System.out.println("Wprowadzono: " + next);

            next = scanner.nextLine();
        }
    }

}
