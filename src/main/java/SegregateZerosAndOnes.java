import java.util.*;

/*
 * https://www.interviewbit.com/problems/segregate-0s-and-1s-in-an-array
 * O(n) time | O(1) space
 */
public class SegregateZerosAndOnes {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        if (A == null || A.size() == 0)
            return new ArrayList<>();

        int i = 0, j = 0;
        while (j < A.size()) {
            if (A.get(j) == 0) {
                A.set(i++, 0);
            }
            j++;
        }
        while (i < A.size()) {
            A.set(i++, 1);
        }
        return A;
    }
}
