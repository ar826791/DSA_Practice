// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

//     *
//    ***
//   *****
//  *******
// *********

// Print the pattern in the function given to you.

public class Pattern7 {
    public static void main(String[] args) {
        class Solution {
            public static void pattern7(int n) {
                for(int i = 1; i <= n; i++) {
                    for(int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for(int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        Solution.pattern7(5);
    }
}