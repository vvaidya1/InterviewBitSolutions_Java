/**
 * https://www.interviewbit.com/problems/palindromic-time/
 */
public class PalindromicTime {
    public int solve(String A) {
        if (A == null || A.length() != 5)
            return 0;

        int hh = (A.charAt(0) - '0') * 10 + A.charAt(1) - '0';
        int mm = (A.charAt(3) - '0') * 10 + A.charAt(4) - '0';
        int counter = 0;

        while (!isPalindrome(hh, mm)) {
            hh = (hh + (mm + 1) / 60) % 24;
            mm = (mm + 1) % 60;
            counter++;
        }
        return counter;
    }

    boolean isPalindrome(int hh, int mm) {
        return (hh / 10 == mm % 10) && (hh % 10 == mm / 10);
    }
}
