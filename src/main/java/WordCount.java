/**
 * https://www.interviewbit.com/problems/word-count/
 * O(n) time | O(1) space - where n is the length of input string
 */
public class WordCount {
    public int solve(String A) {
        if (A == null || A.length() == 0)
            return 0;

        int start = 0, end = A.length() - 1, count = 0;
        while (start <= end && A.charAt(start) == ' ')
            start++;

        while (start <= end && A.charAt(end) == ' ')
            end--;

        while (start <= end) {
            count++;
            while (start <= end && A.charAt(start) != ' ')
                start++;

            while (start <= end && A.charAt(start) == ' ')
                start++;
        }

        return count;
    }
}
