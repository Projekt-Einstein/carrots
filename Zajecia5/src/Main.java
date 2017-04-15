import java.time.LocalDate;

/**
 * @Author Dominik Ciborowski
 */
public class Main {

    public static void main(String[] args) {
        Kot kot1 = new Kot("Konop", "zielony");
        Kot kot2 = new Kot("Azazel", "czarny", LocalDate.of(100, 01, 01));
        Kot kot3 = new Kot("Xian Ming", "niebieski", LocalDate.of(2015, 02, 03), true);

        System.out.println(kot1);
        System.out.println(kot2);
        System.out.println(kot3);
    }

}
