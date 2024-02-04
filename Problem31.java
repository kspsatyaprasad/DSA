import java.io.*;

class Problem31 {

    public static int calculateMaxWater(int[] heights) {
        int maxWater = 0;

        for(int left = 0; left < heights.length; left++) {
            for(int right = left + 1; right < heights.length; right++) {
                maxWater = Math.max(maxWater, Math.min(heights[left], heights[right]) * (right - left));
            }
        }
        return maxWater;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int heights1[] = { 1, 5, 4, 3 };
        int heights2[] = { 3, 1, 2, 4, 5 };

        System.out.println(calculateMaxWater(heights1));
        System.out.println(calculateMaxWater(heights2));
    }
}
