package string;

public class Valid_Palindrome_125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        int l = 0, h = sb.length() - 1;

        while (l <= h) {
            char cl = sb.charAt(l), ch = sb.charAt(h);
            if (cl != ch) return false;
            l++;
            h--;
        }

        return true;
    }
}
