package zajecia4;

/**
 * @author Dominik C.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = {1, 3, 4, 5, 6};
        System.out.println(findMax(tab));
    }

    private static int findMax(int[] tab) {
        int max = tab[0];
        for (int elem : tab) {
            if (max < elem) {
                max = elem;
            }
        }

        return max;
    }


}
