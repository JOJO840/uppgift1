package SortTest;

import Sorter.Sorter;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {

        Sorter sorter = new Sorter();
        int[] listWithNegatives = {-55, 4, 2, -5, 100, -100};
        testSorterWithNegatives(sorter, listWithNegatives);

        int[] listWithZero = {4, -5, 6, 222, -98, 0};
        testSorterWithZeroes(sorter, listWithZero);






    }

    private static void testSorterWithZeroes(Sorter sorter, int[] listWithZero) {
        //Expected result = {-98, -5, 0, 4, 6, 222};
        int[] expected2 = {-98, -5, 0, 4, 6, 222};
        int[] result2 = sorter.sort(listWithZero);
        for (int x : result2) {
            System.out.print(x + ", ");
        }
        System.out.println("");
        for (int j : expected2) {
            System.out.print(j + ", ");
        }
        System.out.println("");
        if (Arrays.equals(result2, expected2)) {
            System.out.println("OK");
        } else {
            System.out.println("Error expected arraylist " + Arrays.toString(expected2) + " " + "You got " + Arrays.toString(result2));
        }
    }

    public static void testSorterWithNegatives(Sorter sorter, int[] array1) {
        //Expected result = {-100,-55,-5,2,4,100};
        int[] expected1 = {-100, -55, -5, 2, 4, 100};
        int[] result1 = sorter.sort(array1);
        for (int x : result1) {
            System.out.print(x + ", ");
        }
        System.out.println("");
        for (int j : expected1) {
            System.out.print(j + ", ");
        }
        System.out.println("");
        if (Arrays.equals(result1, expected1)) {
            System.out.println("OK");
        } else {
            System.out.println("Error expected arraylist " + Arrays.toString(expected1) + " " + "You got " + Arrays.toString(result1));
        }

    }
}



