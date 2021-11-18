package SortTest;

import Sorter.Sorter;

import java.util.Arrays;

public class SortTest {
    public static void main(String [] args) {

        Sorter sorter = new Sorter();
        int[] listWithNegatives = {-55,4,2,-5,100,-100};
        testSorterWithNegatives(sorter, listWithNegatives);


             //nästa lista
        //int[] listWithZero = {4,-5,6,222,-98,0,40,0};



    }

    public static void testSorterWithNegatives(Sorter sorter, int[] array1){
        //Expected result = {-100,-55,-5,2,4,100};
        int[] expected ={-100,-55,-5,2,4,100};
        int[] result = sorter.sort(array1);
        for (int x : result) {
            System.out.print(x + ", ");
        }
        System.out.println("");
        for (int j:expected) {
            System.out.print(j + ", ");
        }
        System.out.println("");
        if (Arrays.equals(result,expected)){
            System.out.println("OK");
        }
    }
}
