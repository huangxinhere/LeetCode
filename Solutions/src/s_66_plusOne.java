import java.lang.reflect.Array;
import java.util.Arrays;

public class s_66_plusOne {

    public static void main(String args[]){
        int[] a = new int[]{0};
        System.out.println(Arrays.toString(plusOne(a)));                                //直接println的是数组的首地址；要么用for，要么用for(int e : a)
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length,add = 0;
        digits[len-1] += 1 ;
        for (int i = len-1 ; i >= 0 ; i--){
            if ((digits[i] + add)< 10){
                digits[i] += add;
                add = 0;//没有超过10
                return digits;
            }else {
                digits[i] = 0;
                add = 1;//超过10
            }
        }
        if(add == 1){
            int[] a = new int[len+1];
            a[0] = 1;
            for (int j = 1; j <= len ; j++){
                a[j] = digits[j-1];
            }
            return a;
        }else return digits;
    }
}
//public int[] plusOne(int[] digits) {
//        for (int i = digits.length - 1; i >= 0; i--) {
//            digits[i]++;
//            digits[i] = digits[i] % 10;
//            if (digits[i] != 0) return digits;
//        }
//        digits = new int[digits.length + 1];
//        digits[0] = 1;                         【其余默认为0】
//        return digits;
//    }
