import java.util.*;
/*
 * https://www.interviewbit.com/problems/deserialize
 * O(n.m) time | O(1) space - where n is the length of the string and m is average length of the word
 */
public class Deserialize {
    public ArrayList<String> deserialize(String A) {
        if (A == null || A.length() == 0)
            return new ArrayList<>();

        String[] input = A.split("~");
        ArrayList<String> result = new ArrayList<>();
        for (String str : input) {
            int i = 0;
            while (i < str.length()) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    i++;
                else
                    break;
            }
            result.add(str.substring(0,i));
        }
        return result;
    }

}
