package zajecia4;

/**
 * @author Dominik C.
 */
public class Zadanie2 {

    public static void main(String[] args) {
        int[] tab1 = {-1, 2, -3, 4, 10};
        int[] tab2 = {-10, 12, -3, 23, 14};
        int[] tab3 = {-10, 120, -300, 21, 12};

        System.out.println(findMin(tab1));
        System.out.println(findMin(tab2));
        System.out.println(findMin(tab3));
    }

    private static int findMin(int[] tab) {
        int min = tab[0];

        for (int elem : tab) {
            if (min > elem) {
                min = elem;
            }
        }

        return min;
    }

}
