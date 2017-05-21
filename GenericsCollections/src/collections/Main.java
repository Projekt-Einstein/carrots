package collections;

import java.util.*;

/**
 * Created by domino on 5/16/17.
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(2);

        System.out.println(intList.get(1));

        Set<Double> hashSet = new HashSet<>();
//        HashSet<Double> hashSet = new HashSet<>(); - nie ladnie

        hashSet.add(2.1);

//        hashSet.get(1); ???

        for (Double d : hashSet) {

        }

//        Iterator iter = hashSet.iterator();
//        while (iter.hasNext()) {
//
//        }

        Map<String, Integer> map = new HashMap<>();
        map.put("ala", 123);
        System.out.println(map.get("ala"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
