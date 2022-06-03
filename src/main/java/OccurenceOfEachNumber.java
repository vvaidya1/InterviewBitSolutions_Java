import java.util.*;

/*
 * https://www.interviewbit.com/problems/move-zeroes/
 * O(n.log.n) time | O(n) space
 */
public class OccurenceOfEachNumber {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        if (A == null || A.size() == 0)
            return new ArrayList<>();

        Map<Integer, Integer> freq = new TreeMap<>();
        for (int item : A) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }

        return new ArrayList<>(freq.values());
    }
}
