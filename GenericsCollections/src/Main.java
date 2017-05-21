import java.util.StringTokenizer;

/**
 * Created by domino on 5/16/17.
 */
public class Main {

    public static int MAX;

    static {
        MAX = 10000;
        System.out.println("Statyczny blok inicjalizacyjny");
    }

    {
        System.out.println("blok inicjalizacyjny");
    }

    public Main() {
        System.out.println("Konstruktor");
    }

    public static void main(String[] args) {
//        new Main();
//        new Main();
//        new Main();
//
//        String string1 = "";
//
//        {
//            int x = 0;
//        }
//
////        System.out.println(x); x - niedostepne
//
//        StringBuilder sb = new StringBuilder();
//        long start2 = System.currentTimeMillis();
//        for (int i = 0; i < MAX; i++) {
//            sb.append("a");
//        }
//        long finish2 = System.currentTimeMillis();
//        System.out.println("Czas wykonania (StringBuilder): " + (finish2 - start2) + " ms");
//
//        StringBuffer sb2 = new StringBuffer();
//        long start3 = System.currentTimeMillis();
//        for (int i = 0; i < MAX; i++) {
//            sb2.append("a");
//        }
//        long finish3 = System.currentTimeMillis();
//        System.out.println("Czas wykonania (StringBuffer): " + (finish3 - start3) + " ms");
//
//        long start1 = System.currentTimeMillis();
//        for (int i = 0; i < MAX; i++) {
//            string1 += "a";
//        }
//        long finish1 = System.currentTimeMillis();
//
////        StringBuilder sb = new StringBuilder();
////        long start2 = System.currentTimeMillis();
////        for (int i = 0; i < MAX; i++) {
////            sb.append("a");
////        }
////        long finish2 = System.currentTimeMillis();
//
//        System.out.println("Czas wykonania (String +=): " + (finish1 - start1) + " ms");

//        StringTokenizer stringTokenizer = new StringTokenizer("Ala ma\tkota", "ak", true);
//
//
//        while (stringTokenizer.hasMoreTokens()) {
//            System.out.println(stringTokenizer.nextToken());
//        }

    }

}
