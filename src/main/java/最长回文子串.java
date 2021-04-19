import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class 最长回文子串 {
    public String longestPalindrome(String s) {
        int strLen = s.length();
        int left = 0;
        int right = 0;

        int len = 1;
        int maxStart = 0;
        int maxLen = 0;
        for (int i = 0; i < strLen; i++) {
            left = i-1;
            right = i+1;
            while (left>=0 && s.charAt(i)==s.charAt(left)){
                left--;
                len++;
            }
            while (right<strLen && s.charAt(i) == s.charAt(right)){
                right++;
                len++;
            }

            while (left >= 0 && right < strLen && s.charAt(left) == s.charAt(right)){
                len += 2;
                left--;
                right++;
            }
            if(len>maxLen){
                maxLen = len;
                maxStart = left;
            }
            len = 1;
        }
        return s.substring(maxStart+1,maxLen+maxStart+1);

    }

}
