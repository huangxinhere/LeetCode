package dp;

public class s_1716 {

    public static void main(String[] args){
        int[] nums = new int[]{2,1,4,5,3,1,1,3};
        System.out.println(massage(nums));
    }

    public static int massage(int[] nums) {
        int[][] dp = new int[nums.length][2];
        int sum = 0;
        //特殊情况 或者 不在循环（包含return）考虑范围内
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        dp[0][0] = 0;//第一天不预约
        dp[0][1] = nums[0];//第一天预约

        for (int i = 1 ; i < nums.length ; i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = dp[i-1][0] + nums[i];
            sum = Math.max(dp[i][0],dp[i][1]);
        }
        return sum;
    }
}
