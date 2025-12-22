package dp;
import java.util.Arrays;

class HouseRobberII{
     
    static int helper(int[] nums){
        if(nums.length == 0) return 0;
        int prev1 = nums[0];
        int prev2 = 0;

        for(int i = 1; i< nums.length; i++ ){
            int take = nums[i] + prev2;
            int notTake = 0 + prev1;
            int curr =  Math.max(take,notTake);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    static int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] arr1 = Arrays.copyOfRange(nums, 1, nums.length);
        int[] arr2 = Arrays.copyOfRange(nums, 0, nums.length-1);

       return Math.max(helper(arr1),helper(arr2));
    }
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(rob(arr));
    }
}