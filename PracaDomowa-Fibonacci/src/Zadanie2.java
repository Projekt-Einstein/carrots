/**
 * Created by rpi on 19.04.2017.
 */
public class Zadanie2 {

    public static void main(String[] args) {
        final int N = 1000000;

        long rekStart = System.currentTimeMillis();
        int i;
        for (i = 0; fRekurencyjnie(i) <= N; i++) {}
        long rekStop = System.currentTimeMillis();

        long normalStart = System.currentTimeMillis();
        int j;
        for (j = 0; f(j) <= N; j++) {}
        long normalStop = System.currentTimeMillis();

        System.out.println(" Metoda\t\t\t| Wynik\t| Czas[ms]");
        System.out.println("================|=======|==========");
        System.out.println("Rekurencyjnie\t| " + (i - 1) + "\t| " + (rekStop - rekStart));
        System.out.println("Normalnie\t\t| " + (j - 1) + "\t| " + (normalStop - normalStart));
    }

    static int fRekurencyjnie(int n) {
        if (n == 0) {
            return 0;
        } else {
            return fRekurencyjnie(n - 1) + n;
        }
    }

    static int f(int n) {
        return ((n * (n + 1)) / 2);
    }

}
