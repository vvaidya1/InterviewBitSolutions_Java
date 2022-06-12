import java.util.*;

/*
 * https://www.interviewbit.com/problems/pairs-with-given-xor/
 * O(n) time | O(n) space - where n is the length of input array
 */
public class PairsWithGivenXor {
    public int solve(ArrayList<Integer> A, int B) {
        if (A == null || A.size() == 0)
            return 0;

        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer num : A) {
            if (set.contains(B ^ num))
                result++;
            set.add(num);
        }
        return result;
    }
}
