/*
 * https://www.interviewbit.com/problems/self-permutation
 * O(n) time | O(1) space - where n is the length of input string
 */
public class SelfPermutation {
    public int permuteStrings(String A, String B) {
        if (A == null || B == null || A.length() != B.length())
            return 0;

        int[] freq = new int[26];
        for (int i = 0; i < A.length(); i++) {
            freq[A.charAt(i) - 'a']++;
            freq[B.charAt(i) - 'a']--;
        }

        for (int item : freq) {
            if (item != 0)
                return 0;
        }
        return 1;
    }
}
