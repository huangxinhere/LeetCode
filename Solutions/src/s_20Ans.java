import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class s_20Ans {
    public static void main(String args[]){
        String s = "[()]";
        if (isValid(s)) System.out.println("true");
        else System.out.println("false");
    }

    public static boolean isValid(String s){
        int n = s.length();
        //排除长度为单数的
        if (n % 2==1) return false;
        //HashMap,两两匹配，左边是key
        Map<Character,Character> pairs = new HashMap<>(){
            {
                put(')','(');
                put(']','[');
                put('}','{');
            }
        };
        //栈
        Deque<Character> stack = new LinkedList<>();
        //
        for (int i=0;i<n;i++){
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)){//判断是否是右括号（肯定是第一次出现的
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)){//分别对应没有左括号或者不匹配
                    return false;
                }
                stack.pop();//匹配的出去
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
