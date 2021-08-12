package dp;

public class s_53_maxSubArray {
    /*最大子序列连续和*/
    public static void main(String args[]){
        int[] a = {1,2,-1,4};
        System.out.println(maxSubArray(a));
    }
// Kadane算法扫描一次整个数列的所有数值，
// 在每一个扫描点计算以该点数值为结束点的子数列的最大和（正数和）。
// 该子数列由两部分组成：以前一个位置为结束点的最大子数列、该位置的数值。
// 因为该算法用到了“最佳子结构”（以每个位置为终点的最大子数列都是基于其前一位置的最大子数列计算得出,
// 该算法可看成动态规划的一个例子。
// 状态转移方程：sum[i] = max{sum[i-1]+a[i],a[i]}
// 其中(sum[i]记录以a[i]为子序列末端的最大序子列连续和)

/*我的理解：[5,-1,2,-3,6,7]
* 如果从头开始，比如[a],[a,b],[a,b,c]...连续子序列会又增又减，可大可小，充满了不确定性，只能暴力遍历
* 长度未知，起终点未知的情况下，定起点太不确定。定终点？例如[c],[b,c],[a,b,c]...
* [5]以5为终点，只有一种情况，max=5
* [5,-1]以-1为终点，有[5,-1],[-1]两种情况.对应4,-1,选[5,-1]
* 以2为终点,有[5,-1,2],[-1,2],[2],max是[5,-1,2],不考虑[-1,2],所以比较前者和[2],选[5,-1,2]...
* ...
* 所以是逆向遍历,但因为有重复部分可以先比较进行取舍,减少计算
* */
    public static int maxSubArray(int[] nums) {

        int pre = 0, maxAns = nums[0];
        for (int x : nums){
            pre = Math.max(pre + x,x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

            /*int len = nums.length, max = nums[0],sum;

        if (len == 1) return nums[0];

        for (int i = 1 ; i <= len ; i++){
            for (int j = 0 ; j <= len - i ; j++){
                sum = 0;
                for (int k = j ; k < j + i ; k++){
                    sum += nums[k];
                }
                if (sum > max) max = sum;
            }
        }

        return max;*///暴力算法超时
}
