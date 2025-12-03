import java.util.*;

public class Lc503 {

    static int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        Arrays.fill(ans, -1);
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < 2 * length; i++) {
            int id = i % length;
            
            while (!s.isEmpty() && nums[s.peek()] < nums[id]) {
                ans[s.pop()] = nums[id];
            }

            if (i < length) {
                s.push(id);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = {5,4,3,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(ans)));
    }

}
