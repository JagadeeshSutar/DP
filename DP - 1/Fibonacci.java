// public class Fibonacci {
// public static int fib(int n) {
// if (n == 0 || n == 1) {
// return n;
// }
// return fib(n - 1) + fib(n - 2);
// }

// public static void main(String[] args) {
// int n = 10;
// System.out.println("Fibonacci number at position " + n + " is " + fib(n));
// }
// }

// Optimization using DP with O(n) - Memoization

// public class Fibonacci {
// public static int fib(int n, int f[]) {
// if (n == 0 || n == 1) {
// return n;
// }
// if (f[n] != 0) {
// return f[n];
// }
// f[n] = fib(n - 1, f) + fib(n - 2, f);
// return f[n];
// }

// public static void main(String[] args) {
// int n = 10;
// int f[] = new int[n + 1];
// System.out.println("Fibonacci number at position " + n + " is " + fib(n, f));
// }
// }

// DP is optimized recursion

// How to identify DP?
// a.Optimal Problem - least, most, min, max, largest, smallest
// b.some choice is given (multiple branches in recursion tree)

// Definition - Dynamic programming is a technique in computer programming that
// helps to efficiently solve a class of problems that have overlapping
// subproblems and optimal substructure property.

/*
 * Ways of DP
 * 1. Memoization(top down) 2.Tabulation(Bottom up)
 * a.recursion we don't use recursion here we use iterations(loops)
 * b.subproblems -> storage
 * |
 * reuse
 * 
 */

// Fibonacci using Tabulation method - O(n)

// public class Fibonacci {

// public static int fib(int n, int f[]) {
// f[0] = 0;
// f[1] = 1;
// for (int i = 2; i <= n; i++) {
// f[n] = fib(n - 1, f) + fib(n - 2, f);
// }
// return f[n];
// }

// public static void main(String args[]) {
// int n = 10;
// int f[] = new int[n + 1];
// System.out.println(fib(n, f));
// ;
// }
// }

// 7 IMPORTANT CONCEPTS OF DP
// 1.Fibonacci
// 2.0-1 Knapsack
// 3.Unbouded Knapsack
// 4.Longest Common Subsequence
// 5.Kadane's algorithm (Arrays)
// 6.Catalan Number
// 7.DP on Grid(2D Arrays)

// Fibonacci ---------------
// Climbing Stairs

// Number Factors

// Min Jumps to reach the end

// Min Jumps with cost

// House thief

// 0-1 Knapsack-------------------
// Subset Sum

// Equal Subset Sum partition

// Min Subset Sum Difference

// Count of Subset Sum

// Target Sum

// Unbounded Knapsack-----------------
// Rod Cutting

// Coin Change

// Min Coin Change

// Max Ribbon Cut

// LCS (Longest Common Subsequence)------------------------------
// Longest Common Substring

// Edit Distance

// Box Stacking

// Longest Increasing Subsequence

// Longest Bitonic Subsequence

// Subsequence Pattern Matching

// Min Add/Delete to convert one string to another

// Catalan Number----------------------------------
// No. of BSTs

// N Parentheses

// Convex Polygons

// Disjoint Chords

// Catalan Triangle

// Mountain Ranges

// Dyck Words

///////////////////////////////////////////////////////////////////

//Climbing stairs
// Count ways to reach the nth stair. The person can climb eighter 1 stair or 2 stairs at a time

// public class Fibonacci {
//   public static int climbStairs(int n) {
//     if (n == 0)
//       return 1;
//     if (n < 0)
//       return 0;

//     return climbStairs(n - 1) + climbStairs(n - 2);
//   }

//   public static void main(String[] args) {
//     System.out.println(climbStairs(5)); // Output: 5
//   }
// }

//Use of Memoization to optimize the solution

public class Fibonacci {
  public static int climbStairs(int n, int dp[]) {
    if (n < 0)
      return 0;// Base case
    if (n == 0 || n == 1)
      return 1;

    if (dp[n] != 0)
      return dp[n];

    dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
    return dp[n];
  }

  public static void main(String[] args) {
    int n = 5;
    int dp[] = new int[n + 1];
    System.out.println(climbStairs(n, dp)); // Output: 5
  }
}

