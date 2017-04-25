/**
 * Created by rpi on 25.04.2017.
 */
public class NowyMain {

    public static void main(String[] args) {
        KlasaZUnikalnymID kl = new KlasaZUnikalnymID();
        Object kl2 = new Object();
        IMyAwsomeInterface myAwsomeInterface = kl;

        System.out.println(kl.equals(kl2));
        System.out.println(kl.zwroc2());
        System.out.println(myAwsomeInterface.zwroc2());
    }

}
