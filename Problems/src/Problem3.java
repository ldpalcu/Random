/**
 * Given two sorted arrays, find the number of elements in common. The arrays are the same length
 * and each has all distinct elements. (73)
 * Time complexity: O(N)
 * Space complexity: O(1)
 */

public class Problem3 {

    private int[] firstArray;
    private int[] secondArray;

    public Problem3(int[] firstArray, int[] secondArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
    }


    public int getNumberOfCommonElements() {
        int i = 0, j = 0, k = 0;
        while (j < firstArray.length) {
            if (secondArray[i] == firstArray[j]) {
                k++;
                System.out.println(secondArray[i] + " found.");
                i++;
                j++;
            } else if (secondArray[i] > firstArray[j]) {
                j++;
            } else {
                i++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[] firstArray = new int[]{13, 27, 35, 40, 49, 50, 55};
        int[] secondArray = new int[]{17, 35, 39, 40, 55, 58, 60};
        Problem3 problem3 = new Problem3(firstArray, secondArray);
        System.out.println("Number of elements in common: " + problem3.getNumberOfCommonElements());

        long stopTime = System.currentTimeMillis();
        System.out.println("Time of execution: " + (stopTime - startTime)/1000.0f+ " seconds.");
    }

}
