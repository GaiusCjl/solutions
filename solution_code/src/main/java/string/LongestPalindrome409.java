package string;

public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        int len = 0;
        boolean hasOdd = false;
        int[] countsUp = new int[26], countsLow = new int[26];

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                countsUp[c - 'A']++;
            } else {
                countsLow[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (countsLow[i] % 2 == 0) len += countsLow[i];
            else {
                if (!hasOdd) hasOdd = true;
                len += countsLow[i] - 1;
            }

            if (countsUp[i] % 2 == 0) len += countsUp[i];
            else {
                if (!hasOdd) hasOdd = true;
                len += countsUp[i] - 1;
            }
        }

        return hasOdd ? len + 1:len;
    }
}
