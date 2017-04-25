package zajecia4;

import java.util.Arrays;

/**
 * @author Dominik C.
 */
public class Zadanie3 {

    public static void main(String[] args) {
        int[] array1 = {1, -2, 7, -34, 10, 23, 2};
        int[] array2 = {11, -24, -87, -34, 710, 33, 2, 2};
        int[] array3 = {1, -2, 7, -34, 10, 23, 2};
        int[] array4 = {1, 2, 3, 45, -1, -20};

        System.out.println("Sort result: " + Arrays.toString(sort(array1, false)));
        System.out.println("array1 after sorting: " + Arrays.toString(array1));

        System.out.println("Unmodifiable sort result: " + Arrays.toString(sortUnmodifiable(array2, true)));
        System.out.println("array2 after unmodifiable sort: " + Arrays.toString(array2));

        System.out.println("Sort using Array.sort ascending: " + Arrays.toString(sort1(array3, true)));
        System.out.println("Sort using Array.sort descending: " + Arrays.toString(sort1(array3, false)));

        System.out.println("Wywolanie varargs 1: " + Arrays.toString(sortWithVarargs(array4))); // znaczy to samo co linijka nizej
        System.out.println("Wywolanie varargs 2: " + Arrays.toString(sortWithVarargs(array4, true)));
        System.out.println("Wywolanie varargs 3: " + Arrays.toString(sortWithVarargs(array4, false)));
    }

    // algorytm selection sort - sortowanie przez wybieranie
    private static int[] sort(int[] array, boolean sortAscending) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (sortAscending) {
                    if (array[j] < array[index]) {
                        index = j;
                    }
                } else {
                    if (array[j] > array[index]) {
                        index = j;
                    }
                }
            }

            int tmp = array[index];
            array[index] = array[i];
            array[i] = tmp;
        }
        return array;
    }

    // Wersja metody bez modyfikacji wyjsciowej tablicy
    private static int[] sortUnmodifiable(int[] array, boolean sortAscending) {
        int[] copy = Arrays.copyOf(array, array.length);

        return sort(copy, sortAscending);
    }

    // Ladniejsze - uzywamy Arrays.sort()
    private static int[] sort1(int[] array, boolean sortAscending) {
        Arrays.sort(array);

        if (!sortAscending) {
            return reverseArray(array);
        }

        return array;
    }

    // odwracanie tablicy
    private static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversed[i] = array[j];
        }

        return reversed;
    }

    // dzieki zastosowaniu varargs nie musimy zawsze podawac ostatniego parametru
    // ale oczywiscie cos za cos - kod staje sie mniej czytelny
    private static int[] sortWithVarargs(int[] array, boolean... sortAscending) {
        if (sortAscending.length > 0) {
            return sort(array, sortAscending[0]);
        } else {
            return sort(array, true);
        }
    }

}
