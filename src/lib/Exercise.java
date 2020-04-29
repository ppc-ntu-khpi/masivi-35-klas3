package lib;


import java.util.Arrays;

/**
 * Class that calculates the biggest number in two dimensional array
 * @author Ivan Shapovalov
 */
public class Exercise {
    /**
     * Method that calculates the biggest number in two dimensional integer array
     * @param array source array
     * @return the biggest integer number in source array
     */
    public static Integer GetTheBiggestNumber(int[][] array) {
        if(array == null) {
            return null;
        }
        
        int[] resultArray = new int[array[0].length + array[1].length];
        
        for(int[] row : array) {
            System.arraycopy(row, 0, resultArray, 0, row.length);
        }
        
        Arrays.sort(resultArray);
        
        return resultArray[resultArray.length - 1];
    }
}
