import java.util.ArrayList;

/**
 * https://www.interviewbit.com/problems/pangram-check/
 */
public class PangramCheck {
    public int solve(ArrayList<String> A) {
        int[] set = new int[26];

        for (String str : A) {
            for (int i = 0; i < str.length(); i++) {
                set[str.toLowerCase().charAt(i) - 'a']++;
            }
        }

        for (int item : set) {
            if (item == 0)
                return 0;
        }
        return 1;
    }
}
