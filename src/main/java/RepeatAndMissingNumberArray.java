import java.util.*;

/*
 * https://www.interviewbit.com/problems/repeat-and-missing-number-array/#
 * O(n) time | O(1) space
 */
public class RepeatAndMissingNumberArray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        if (A == null || A.size() == 0)
            return new ArrayList<>();

        long n = A.size();
        long sumN = (n * (n + 1)) / 2;
        long sumNSq = (n * (n + 1) * (2 * n + 1)) / 6;

        for (Integer num : A) {
            sumN -= (long) num;
            sumNSq -= (long) num * (long) num;
        }

        long sum = sumNSq / sumN;
        long missingNumber = (sum + sumN) / 2;
        long repeatedNumber = sum - missingNumber;

        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) repeatedNumber);
        result.add((int) missingNumber);
        return result;
    }
}

