package test;

import lib.Exercise;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        System.out.println(
                "The biggest number in array \n" 
                + Arrays.toString(array[0]) + "\n"
                + Arrays.toString(array[1]) + "\nis " 
                + Exercise.GetTheBiggestNumber(array)
        );
    }
}
