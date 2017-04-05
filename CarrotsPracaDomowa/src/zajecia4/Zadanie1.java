package zajecia4;

/**
 * Poniższy kod przekształć tak aby korzystał z pętli
 * a.  while
 * b.  do-while
 * for (int i = 0; i < 100; i++) {
 *    System.out.println("Iteracja numer: " + i);
 * }
 *
 * @author Dominik C.
 */
public class Zadanie1 {

    public static void main(String[] args) {
        //petla while

        int i = 0;

        while (i < 100) {
            System.out.println("Iteracja numer: " + i);
            i++;
        }

        i = 0;

        do {
            System.out.println("Iteracja numer: " + i);
            i++;

        } while (i < 100);
    }

}
