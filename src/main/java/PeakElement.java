import java.util.*;

/*
 * https://www.interviewbit.com/problems/find-a-peak-element
 * O(log.n) time | O(1) space
 */
public class PeakElement {
    public int solve(ArrayList<Integer> A) {
        if (A == null || A.size() == 0)
            return -1;

        int start = 0, end = A.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0 || mid == A.size() - 1)
                return A.get(mid);
            else if (A.get(mid - 1) < A.get(mid) && A.get(mid) > A.get(mid + 1))
                return A.get(mid);
            else if (A.get(mid - 1) < A.get(mid))
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
