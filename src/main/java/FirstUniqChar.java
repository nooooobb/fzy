import java.util.*;

public class FirstUniqChar {
    public static void main(String[] args) {
        String a = "leetcode";
//        System.out.println(firstUniqChar(a));
        firstUniqChar2(a);
    }
    public static char firstUniqChar(String s) {

        char result = 0;
        if("".equals(s)){
            result = 32;
        }
        char[] sc = s.toCharArray();
        Set<Character> mid = new HashSet<>();
        Set<Character> mid2 = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            mid2.add(s.charAt(i));
            if (!mid.add(s.charAt(i))){
                mid2.remove(s.charAt(i));
            }
        }

        for (Character a:sc) {
            if(mid2.contains(a)){
                result = a;
                break;
            }
            result = 32;
        }
        System.out.println(result);
        return result;
    }

    //无序hash表
    public static char firstUniqChar2(String s) {
        char[] sc = s.toCharArray();
        char result = 0;
        if("".equals(s)){
            result = 32;
            return result;
        }
        HashMap<Character, Boolean> map = new HashMap<>();
        for (char c:sc) {
            map.put(c,!map.containsKey(c));
        }

        for (char c:sc) {
            if(map.get(c)){
                result = c;
                break;
            }
            result = 32;
        }
        System.out.println(result);
        return result;
    }

    //有序hash
    public char firstUniqChar3(String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(Map.Entry<Character, Boolean> d : dic.entrySet()){
            if(d.getValue()) return d.getKey();
        }
        return ' ';
    }


}
