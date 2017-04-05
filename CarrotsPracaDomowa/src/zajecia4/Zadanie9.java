package zajecia4;

/**
 * @author Dominik C.
 */
public class Zadanie9 {

    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
