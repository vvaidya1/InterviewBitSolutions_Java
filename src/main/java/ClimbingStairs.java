import java.util.*;

/**
 * https://www.interviewbit.com/problems/climbing-stairs/
 * O(n) time | O(n) space - where n is the length of input array
 */
public class ClimbingStairs {
    public int solve(ArrayList<Integer> A) {
        if (A == null || A.size() == 0)
            return 0;

        int[] cost = new int[A.size()];
        cost[0] = A.get(0);
        cost[1] = A.get(0) + A.get(1);
        for(int i = 2; i < A.size(); i++) {
            cost[i] = Math.min(cost[i-1], cost[i-2]) + A.get(i);
        }
        return cost[A.size() - 1];
    }
}
