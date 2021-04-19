public class 反转字符串的单词 {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int length = s.length();
        int i = 0;

        while (i<length){
            int start = i;

            while (i<length && s.charAt(i)!=' '){
                i++;
            }
            for (int p = start; p < i; p++) {
                res.append(s.charAt(start+i-1-p));
            }
            while (i<length && s.charAt(i) == ' ' ){
                res.append(" ");
                i++;
            }

        }
        return res.toString();

    }
}
