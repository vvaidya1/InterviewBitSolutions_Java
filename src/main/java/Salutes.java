/*
 * https://www.interviewbit.com/problems/salutes
 * O(n) time | O(1) space
 */
public class Salutes {
    public Long countSalutes(String A) {
        if (A == null || A.length() == 0)
            return 0L;

        long count = 0, result = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '>')
                count++;
            else
                result += count;
        }
        return result;
    }
}
