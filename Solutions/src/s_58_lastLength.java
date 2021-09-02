public class s_58_lastLength {

    public static void main(String args[]){
        String s = " gggg ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        if (s == null) return 0;
        int sum = 0;

        for (int i = s.length() - 1 ; i >= 0 ; i--){
            //最后一个单词的判断
            if (s.charAt(i) == ' '){
                sum = 0;
                continue;
            }
            sum++;
            if (s.charAt(i) != ' ' && (i == 0||s.charAt(i-1) == ' '))
                break;
        }
        return sum;
    }
}
