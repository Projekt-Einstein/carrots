package zajecia4;

import java.util.Scanner;

/**
 * @author Dominik C.
 */
public class Zadanie6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMainMenu();
        int option = scanner.nextInt();

        while (option != 2) {

            if (option == 1) {
                showArithemticOperationsMenu();
                option = scanner.nextInt();

                System.out.println("Wprowadz dwie liczby: ");
                int num1 = scanner.nextInt(), num2 = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Wynik = " + addNumbers(num1, num2));
                        break;
                    case 2:
                        System.out.println("Wynik = " + substractNumbers(num1, num2));
                        break;
                    case 3:
                        System.out.println("Wynik = " + multiplyNumbers(num1, num2));
                        break;
                    case 4:
                        double result = divideNumbers(num1, num2);

                        if (result == -1) {
                            System.out.println("Blad, nie można dzielic przez 0");
                        } else {
                            System.out.println("Wynik = " + result);
                        }

                        break;
                    default:
                        System.out.println("Blad! Zla opcja!");
                }
            }

            showMainMenu();
            option = scanner.nextInt();
        }

    }

    private static void showMainMenu() {
        System.out.println("Prosze wybrac opcje:");
        System.out.println("1 - Lista dzialan");
        System.out.println("2 - Wyjscie");
    }

    private static void showArithemticOperationsMenu() {
        System.out.println("Lista działań");
        System.out.println("1 - Dodawanie");
        System.out.println("2 - Odejmowanie");
        System.out.println("3 - Mnozenie");
        System.out.println("4 - Dzielenie");
    }

    private static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    private static int substractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    private static double divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            return -1; //error
        }

        return num1 / num2;
    }
}
