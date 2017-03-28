package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int liczba;
//        System.out.println("Podaj liczbe");
//        Scanner odczytajLiczbe = new Scanner(System.in);
//        liczba = odczytajLiczbe.nextInt();
//        if(liczba == 3){
//            System.out.println("Liczba jest równa 3");
//        }else if (liczba > 3 || liczba > 7){
//            System.out.println("Liczba jest wieksza od 3 lub 7");
//        }else{
//            System.out.println("Liczba jest mniejsza od 3");
//        }
//
//        switch (liczba){
//            case 1:
//            case 3:
//                System.out.println("jeden");
//                break;
//            case 2:
//                System.out.println("dwa");
//                break;
//            default:
//                System.out.println("domyslna");
//        }
//        int x = 0;
//        while (x < 0) {
//            System.out.println(x);
//            x++;
//        }
//        x = 0;
//        do {
//            System.out.println(x + "" + "cos");
//            x++;
//        } while (x < 0);


//        int[] array = {1, 2, 3, 4};
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        array[1] = 10;
//        System.out.println(array[1]);
//
//        int[] array1 = new int[5];
//
//        System.out.println(array1);
//        System.out.println(Arrays.toString(array1));
//
//        array1[2] = 3455;
//        System.out.println(Arrays.toString(array1));
//
////        array1[5] = 3; Błąd
//
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("for: " + i);
//        }
//
//        for (int elem : array) {
//            System.out.println("foreach: " + elem);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("array[i] = " + array[i]);
//        }

        String[][] schodki = new String[5][];

        for (int i = 0; i < schodki.length; i++) {
            schodki[i] = new String[i + 1];
        }

//        for (String[] element : schodki) {
//            System.out.println(element.length);
//        }

        for (int i = 0; i < schodki.length; i++) {
            for (int j = 0; j < schodki[i].length; j++) {
                schodki[i][j] = i + " " + j;
            }
        }

        for (int i = 0; i < schodki.length; i++) {
            for (int j = 0; j < schodki[i].length; j++) {
                System.out.print(schodki[i][j] + ",\t");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(schodki));

//        String[][] imiona = new String[5][3];

    }
}
