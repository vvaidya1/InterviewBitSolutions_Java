import java.util.*;

/*
 * https://www.interviewbit.com/problems/highest-score/
 * O(n) time | O(n) space - where n is the length of input array
 */
public class HighestScore {
    public int highestScore(ArrayList<ArrayList<String>> A) {
        if (A == null || A.size() == 0)
            return 0;

        Map<String, Integer> freq = new HashMap<>();
        Map<String, Integer> total = new HashMap<>();
        for (List<String> record : A) {
            freq.put(record.get(0), freq.getOrDefault(record.get(0), 0) + 1);
            total.put(record.get(0), total.getOrDefault(record.get(0), 0) + Integer.parseInt(record.get(1)));
        }

        int result = 0;
        for (Map.Entry entry : freq.entrySet()) {
            String key = (String)entry.getKey();
            int n = (int)entry.getValue();
            int sum = total.get(key);
            result = Math.max(result, sum / n);
        }
        return result;
    }
}
