package zajecia3;

import java.util.Scanner;

/**
 * @author Dominik C.
 */
public class Zadanie5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        String pattern = scanner.next();

        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

}
