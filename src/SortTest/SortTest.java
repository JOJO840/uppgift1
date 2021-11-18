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

        int[] listWithSameElements = {-1,-1,-1,-1,-1};
        testSorterWithSameElements(sorter, listWithSameElements);

        int[] listWithOneElementZero = {0};
        testSorterWithOneElementZero(sorter, listWithOneElementZero);

        int[] emptyArrayList = {};
        testSorterEmptyArrayList(sorter, emptyArrayList);
    }

    private static void testSorterEmptyArrayList(Sorter sorter, int[] emptyArrayList) {

    }

    private static void testSorterWithOneElementZero(Sorter sorter, int[] listWithOneElementZero) {
        //Expected Results = {0};
        int[] expected4 = {0};
        int[] result4 = sorter.sort(listWithOneElementZero);
        System.out.println("Initialising Test Nr 4");
        for (int j : result4) {
            System.out.print(j + ", ");
        }
        System.out.println("");
        for (int x : expected4) {
            System.out.print(x + ", ");
        }
        System.out.println("");
        if(Arrays.equals(result4,expected4)){
            System.out.println("OK");
        } else {
            System.out.println("Error expected arraylist " + Arrays.toString(expected4) + " " + "You got " + Arrays.toString(result4));
        }
    }

    private static void testSorterWithSameElements(Sorter sorter, int[] listWithSameElements) {
            //Expected Results = {-1,-1,-1,-1,-1};
        int[] expected3 = {-1,-1,-1,-1,-1};
        int[] result3 = sorter.sort(listWithSameElements);
        System.out.println("Initialising Test Nr 3");
        for (int j : result3) {
            System.out.print(j + ", ");
        }
        System.out.println("");
        for (int x : expected3) {
            System.out.print(x + ", ");
        }
        System.out.println("");
        if(Arrays.equals(result3,expected3)){
            System.out.println("OK");
        } else {
            System.out.println("Error expected arraylist " + Arrays.toString(expected3) + " " + "You got " + Arrays.toString(result3));
        }
    }

    private static void testSorterWithZeroes(Sorter sorter, int[] listWithZero) {
        //Expected result = {-98, -5, 0, 4, 6, 222};
        int[] expected2 = {-98, -5, 0, 4, 6, 222};
        int[] result2 = sorter.sort(listWithZero);
        System.out.println("Initialising Test Nr 2");
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
        System.out.println("Initialising Test Nr1");
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



