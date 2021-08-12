package dp;

public class s_0801_threeStep {
    public static void main(String args[]){
        System.out.println(waysToStep(61));
    }

    private static int waysToStep(int n) {
        long[] a = new long[n+1];//结果可能很大,要用long型
        a[0] = 1;
        if (n<3)
            return n;
        else {
            a[1]=a[0];
            a[2]=2;
            for (int i=3;i<=n;i++){
                a[i] = a[i-1] + a[i-2] + a[i-3];
                a[i] %=1000000007;//同样针对大结果(题目要求)
            }
        }
        return (int)a[n];

    }
}
