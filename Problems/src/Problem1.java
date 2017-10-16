import java.util.*;

/**
 * Given an array of distinct integer values, count the number of pairs of integers that have difference k.(67)
 * Time complexity: O(N)
 * Space complexity: O(N)
 */

public class Problem1 {

    private int[] array;
    private int difference;

    public Problem1(int[] array, int difference) {
        this.array = array;
        this.difference = difference;
    }

    public int getNumberOfPairs() {
        int count = 0, x;
        //create a hashtable to store the values from the input array
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            hashtable.put(array[i], array[i]);
        }

        //look up if an element from array whose addition
        //or subtraction with difference exists in hashtable
        for (int i = 0; i < array.length; i++) {
            //compute addition
            x = array[i] + difference;
            if (hashtable.get(x) != null && array[i] < x) {
                count++;
                System.out.println("(" + array[i] + "," + (array[i] + difference) + ")");
            }
            //compute difference
            x = array[i] - difference;
            if (hashtable.get(x) != null && array[i] < x) {
                count++;
                System.out.println("(" + array[i] + "," + (array[i] - difference) + ")");
            }
        }

        return count;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[] array = new int[]{1, 7, 5, 9, 2, 12, 3};
        Problem1 problem1 = new Problem1(array, 2);
        System.out.println("Number of pairs is : " + problem1.getNumberOfPairs());

        long stopTime = System.currentTimeMillis();
        System.out.println("Time of execution: " + (stopTime - startTime)/1000.0f+ " seconds.");
    }


}
