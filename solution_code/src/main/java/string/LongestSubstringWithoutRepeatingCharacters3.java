package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int l = 0, h = 0;
        Set<Character> set = new HashSet<>();
        while (h < s.length()) {
            if (!set.contains(s.charAt(h))) {
                set.add(s.charAt(h));
                h++;
                len = Math.max(len, h - l);
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return len;
    }
}
