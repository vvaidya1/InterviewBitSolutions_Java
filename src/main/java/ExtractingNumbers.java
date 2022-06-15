/**
 * https://www.interviewbit.com/problems/extracting-numbers/
 */
public class ExtractingNumbers {
    public Long solve(String A) {
        long sum = 0;
        int start, index = 0;

        while (index < A.length()) {
            if (A.charAt(index) >= '0' && A.charAt(index) <= '9') {
                start = index;
                index++;

                while (index < A.length() && A.charAt(index) >= '0' && A.charAt(index) <= '9')
                    index++;

                sum += (index == A.length()) ? Integer.parseInt(A.substring(start)) : Integer.parseInt(A.substring(start, index));
            }
            else {
                index++;
            }
        }
        return sum;
    }
}
