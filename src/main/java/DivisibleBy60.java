import java.util.*;

/**
 * https://www.interviewbit.com/problems/divisible-by-60/
 * O(n) time | O(1) space - where n is the length of input list
 */
public class DivisibleBy60 {
    public int divisibleBy60(ArrayList<Integer> A) {
        if (A.size() == 1 && A.get(0) == 0)
            return 1;

        boolean hasZero = false, hasEvenNumber = false;
        int sum = 0;
        for (int num : A) {
            sum += num;

            if (num == 0)
                hasZero = true;
            else if (num % 2 == 0)
                hasEvenNumber = true;
        }

        if (!hasZero || !hasEvenNumber)
            return 0;

        return sum % 3 == 0 ? 1 : 0;
    }
}
