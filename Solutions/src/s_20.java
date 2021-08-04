
/*20.有效的括号*/

public class s_20 {
    public static void main(String args[]){
        String s = "[()]";
        if (isValid(s)) System.out.println("true");
        else System.out.println("false");
    }

    public static boolean isValid(String s) {
        int i=0;
        //长度为单数肯定不是
        if (s.length()%2!=0) return false;
        if (swap(s.charAt(0))%2==0) return false;

        for (;i<s.length();i++){
            if (swap(s.charAt(i))%2==0){
                if (judge(s,i,i-1)){
                    s = removeCharAt(s,i);
                    s = removeCharAt(s,i-1);
                    i=0;
                }
                else return false;
            }
        }
        if (s.equals("")) return true;
        else return false;
    }

    public static String removeCharAt(String s,int pos){
       return s.substring(0,pos) + s.substring(pos+1);
    }

    public static int swap(char c){
        int num = 0;
        switch (c)
        {
            case '(':num = 1;break;
            case ')':num = 6;break;
            case '[':num = 3;break;
            case ']':num = 4;break;
            case '{':num = 5;break;
            case '}':num = 2;break;
        }
        return num;
    }

    public static boolean judge(String s,int i,int j){
        if (swap(s.charAt(i))+swap(s.charAt(j))==7)
            return true;
        else return false;
    }
}
