import java.util.ArrayList;

/**
 * https://www.interviewbit.com/problems/integers-in-strings/
 * O(n) time | O(n) space - where n is the length of input string
 */
public class IntegersInStrings {
    public ArrayList<Integer> solve(String A) {
        if (A == null || A.length() == 0)
            return new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        for (String num : A.split(","))
            result.add(Integer.parseInt(num));
        return result;
    }
}
