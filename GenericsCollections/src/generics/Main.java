package generics;

/**
 * Created by domino on 5/16/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(
                new MojaGenerycznaKlasa<Number>(
                        new Integer(1)).getValueClassName());

        MojaGenerycznaKlasa<Integer> klasa =
                new MojaGenerycznaKlasa<Integer>(1);

        System.out.println(
                new MojaGenerycznaKlasa<>(new Double(2))
                        .getValueClassName()
        );

    }

}
