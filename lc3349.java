
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class lc3349 {
    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if (n < 2 * k) return false;

        for(int i = 1; i < n ; i++){
            boolean first = true , second = true;


            for(int j = i; j < i + k -1; j++){
                if(nums.get(j) >= nums.get(j+1)){
                    first = false;
                    break;
                }

            }

             for(int j = i + k; j < i + 2*k -1; j++){
                if(nums.get(j) >= nums.get(j+1)){
                    second = false;
                    break;
                }

            }

             if (first && second) return true;
        }

        return false;
        
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3));
        System.out.println(hasIncreasingSubarrays(l1, 3));
    }
}