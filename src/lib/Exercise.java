package lib;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

/**
 * Class that calculates second largest number in two dimensional array
 * @author Ivan Shapovalov
 */
public class Exercise {
    /**
     * Method that calculates second largest number in two dimensional integer array
     * @param array source array
     * @return second largest integer number in source array
     */
    public static Integer GetSecondNumber(int[][] array) {
        if(array == null) {
            return null;
        }
        
        int[] resultArray = Arrays.copyOf(array[0], array[0].length + array[1].length);
        System.arraycopy(array[1], 0, resultArray, array[0].length, array[1].length);
        Arrays.sort(resultArray);
        
        return (new LinkedHashSet<>(Arrays.stream(resultArray).boxed().collect(Collectors.toList()))
                .toArray(new Integer[0]))[1];
    }
}
