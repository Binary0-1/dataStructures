
import java.util.Arrays;

public class lc128 {

    public static int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int lastsmallest = nums[0];

        int Longest = 1; 
        int count = 1;
        for(int i = 1 ; i< nums.length; i++){

            if(nums[i] == lastsmallest+1){
                lastsmallest = nums[i];
                count++;
            }else if( nums[i] != lastsmallest){
                count = 1;
                lastsmallest = nums[i];
            }

            Longest = Math.max(Longest,count );

        }

        return Longest;
        
    }

    public static void main(String[] args) {
        int[] nw = {1,0,1,2};
        System.out.println(longestConsecutive(nw));
        
    }
    
}
