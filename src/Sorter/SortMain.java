package Sorter;

import Sorter.Sorter;

public class SortMain {
    public static void main(String[] args) {

        int[] nyLista = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            nyLista[i] = Integer.parseInt(args[i]);
        }
            //  gör en instans av klassen Sorter.Sorter
        Sorter sorter = new Sorter();

            // returnerar en lista till klassen
       int[] sortList = sorter.sort(nyLista);


        for (int i = 0; i < sortList.length; i++) {
            System.out.println(sortList[i]); // printar sort listan kolla om det funkar.

        }








    }

}

