package zajecia4;

/**
 * @author Dominik C.
 */
public class Zadanie7 {

    public static void main(String[] args) {
        int[] tab = {1, -5, 9, 10, 78, 24, -24, 69, 2, 1};

        int maxIndex = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[maxIndex] < tab[i]) {
                maxIndex = i;
            }
        }

        System.out.println("maxIndex = " + maxIndex + "\nmax = " + tab[maxIndex]);
    }

}
