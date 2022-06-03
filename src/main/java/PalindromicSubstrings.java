
/*
 * https://www.interviewbit.com/problems/palindromic-substrings
 * O(n^2) time | O(1) space - where n is the length of input string
 */
public class PalindromicSubstrings {
    public int solve(String A) {
        if (A == null || A.length() == 0)
            return 0;

        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            int j = 0;
            while (i - j >= 0 && i + j < A.length() && A.charAt(i - j) == A.charAt(i + j)) {
                result++;
                j++;
            }

            j = 0;
            while (i - j >= 0 && i + j + 1 < A.length() && A.charAt(i - j) == A.charAt(i + j + 1)) {
                result++;
                j++;
            }
        }
        return result;
    }
}
