
import java.util.HashSet;
import java.util.Set;

public class Day7TwoPointers {

    public static void main(String[] args) {

        // String s = "abcecabcdbb";
        String s = "pwwkew";
        // String s = "w";
        Set<Character> set = new HashSet<>();

        int left = 0;  // 1
        int maxLen = 0; // 2

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            int window = right - left + 1;
            maxLen = Math.max(maxLen, window);
        }

        System.out.println(maxLen);
    }

}
