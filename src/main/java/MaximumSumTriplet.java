import java.util.TreeSet;

/**
 * https://www.interviewbit.com/problems/maximum-sum-triplet/
 * O(n) time | O(n) space - where n is the length of input array
 * Reference: https://www.geeksforgeeks.org/find-maximum-sum-triplets-array-j-k-ai-aj-ak/
 */
public class MaximumSumTriplet {
    public int solve(int[] A) {
        if (A == null || A.length == 0)
            return 0;

        int maxSum = Integer.MIN_VALUE;
        int[] maxSuffix = new int[A.length];
        maxSuffix[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            maxSuffix[i] = Math.max(A[i], maxSuffix[i + 1]);
        }

        TreeSet<Integer> leftMax = new TreeSet<>();
        leftMax.add(Integer.MIN_VALUE);
        for (int i = 0; i < A.length - 1; i++) {
            if (maxSuffix[i + 1] > A[i]) {
                maxSum = Math.max(maxSum, leftMax.lower(A[i]) + A[i] + maxSuffix[i + 1]);
                leftMax.add(A[i]);
            }
        }
        return maxSum;
    }
}
