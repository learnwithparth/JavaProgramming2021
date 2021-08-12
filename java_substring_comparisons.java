import java.util.*;

public class java_substring_comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i <= s.length() - k; i++) {
            String temp = s.substring(i, i + k);
            if (temp.compareTo(smallest) < 0) {
                smallest = temp;
            }
            if (temp.compareTo(largest) > 0) {
                largest = temp;
            }

        }
        return smallest + "\n" + largest;

    }
}