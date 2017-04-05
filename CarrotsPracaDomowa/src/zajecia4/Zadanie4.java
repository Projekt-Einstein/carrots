package zajecia4;

import java.util.Scanner;

/**
 * @author Dominik C.
 */
public class Zadanie4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        String pattern = scanner.next();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

}
