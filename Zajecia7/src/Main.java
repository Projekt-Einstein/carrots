/**
 * Created by rpi on 19.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        final int fibArg = 29;
        long rekStart = System.currentTimeMillis();
        int rekRes = Fibonacci.fibonacciRekurencyjny(fibArg);
        long rekStop = System.currentTimeMillis();

        long intStart = System.currentTimeMillis();
        int intRes = Fibonacci.fibonacciIteracyjny(fibArg);
        long intStop = System.currentTimeMillis();

        long varStart = System.currentTimeMillis();
        int varRes = Fibonacci.fibonacci3Zmienne(fibArg);
        long varStop = System.currentTimeMillis();

        System.out.println(" Metoda\t\t\t| Wynik\t\t| Czas[ms]");
        System.out.println("================|===========|==========");
        System.out.println("Rekurencyjnie\t| " + rekRes + "\t| " + (rekStop - rekStart));
        System.out.println("Iteracyjnie\t\t| " + intRes + "\t| " + (intStop - intStart));
        System.out.println("3 Zmienne\t\t| " + varRes + "\t| " + (varStop - varStart));

    }

}
