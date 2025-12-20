package  dp;

import java.util.Arrays;

class MinClimbingStairs {

    static int recurr(int n, int[] cost, int[] dp) {
        if (n <= 1) return 0;

        if(dp[n] != -1){
            return dp[n];
        }

        int left  = recurr(n - 1, cost,dp) + cost[n - 1];
        int right = recurr(n - 2, cost, dp) + cost[n - 2];
        dp[n] = Math.min(left,right);

        return dp[n];
    }

    static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp,-1);
        return recurr(cost.length, cost, dp);
    }

    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(arr));
    }
}
