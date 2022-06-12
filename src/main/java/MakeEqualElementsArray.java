import java.util.*;

/*
 * https://www.interviewbit.com/problems/make-equal-elements-array/
 * O(n) time | O(1) space - where n is the length of input array
 */
public class MakeEqualElementsArray {
    public int solve(ArrayList<Integer> A, int B) {
        if (A == null || A.size() == 0)
            return 0;

        Set<Integer> set = new HashSet<>();
        set.add(A.get(0));
        set.add(A.get(0) + B);
        set.add(A.get(0) - B);
        for (int num : A) {
            if (!set.contains(num) && !set.contains(num + B) && !set.contains(num - B))
                return 0;
        }

        return 1;
    }
}
