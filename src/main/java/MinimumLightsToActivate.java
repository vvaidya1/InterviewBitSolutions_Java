/**
 * https://www.interviewbit.com/problems/minimum-lights-to-activate/
 * O(n) time | O(1) space - where n is the length of input array
 * Reference https://www.youtube.com/watch?v=JG77IVjK8D8
 */
public class MinimumLightsToActivate {
    public int solve(int[] A, int B) {
        if (A == null || A.length == 0)
            return 0;

        int i = 0, result = 0, count = 0;
        while (i < A.length) {
            int left = Math.max(0, i - B + 1);
            int right = Math.min(A.length - 1, i + B - 1);
            boolean found = false;
            while (left <= right) {
                if (A[right] == 1) {
                    count++;
                    found = true;
                    break;
                }
                right--;
            }

            if(!found)
                return -1;
            i = right + B;
        }
        return count;
    }
}
