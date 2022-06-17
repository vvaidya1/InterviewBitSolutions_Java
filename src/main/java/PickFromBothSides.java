import java.util.ArrayList;

/**
 * https://www.interviewbit.com/problems/pick-from-both-sides/
 * O(n) time | O(1) space - where n is the length of input array
 */
public class PickFromBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        if (A == null || A.size() == 0)
            return 0;

        int sum = 0, maxSum;
        for (int i = 0; i < B; i++)
            sum += A.get(i);
        maxSum = sum;

        for (int i = 0; i < B; i++) {
            sum -= A.get(B - 1 - i);
            sum += A.get(A.size() - 1 - i);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
