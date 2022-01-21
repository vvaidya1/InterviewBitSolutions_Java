import java.util.*;

/*
 * https://www.interviewbit.com/problems/matrix-median/
 * O(32 * n * log(m)) time | O(1) space
 * Reference https://www.youtube.com/watch?v=63fPPOdIr2c&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=63
 */
public class MatrixMedian {
    public class Solution {
        public int findMedian(ArrayList<ArrayList<Integer>> A) {
            if (A == null || A.size() == 0)
                return 0;

            int min = 0, max = Integer.MAX_VALUE, mid;
            int desiredElement = (A.size() * A.get(0).size()) / 2;
            while (min <= max) {
                mid = min + (max - min) / 2;
                int countLessThanEqElements = 0;
                for (ArrayList<Integer> list : A) {
                    countLessThanEqElements += getNumOfLessThanEqualElements(list, mid);
                }

                if (countLessThanEqElements <= desiredElement)
                    min = mid + 1;
                else
                    max = mid - 1;
            }
            return min;
        }

        public int getNumOfLessThanEqualElements(ArrayList<Integer> A, int item) {
            int low = 0, high = A.size() - 1, mid;

            while (low <= high) {
                mid = low + (high - low) / 2;
                if (A.get(mid) <= item)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return low;
        }
    }
}
