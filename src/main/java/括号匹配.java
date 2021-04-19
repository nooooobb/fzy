import java.util.Deque;
import java.util.LinkedList;

public class 括号匹配 {
    public static void main(String[] args) {
        String s = "(){}]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Deque<Character> res = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{'){
                res.push('}');
            }else if(s.charAt(i) == '('){
                res.push(')');
            }else if(s.charAt(i) == '['){
                res.push(']');
            }else if(res.size() == 0 || res.pop()!=s.charAt(i)){
                //否则就只能是右括号。
                //1，如果栈为空，说明括号无法匹配。
                //2，如果栈不为空，栈顶元素就要出栈，和这个右括号比较。
                //如果栈顶元素不等于这个右括号，说明无法匹配，
                //直接返回false

                return false;
            }
        }
        //最后如果栈为空，说明完全匹配，是有效的括号。
        //否则不完全匹配，就不是有效的括号
        return res.isEmpty();

    }
}
