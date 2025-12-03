
import java.util.Arrays;
import java.util.Stack;

public class LC84 {

    static int[] rle(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int size = heights.length;
        int[] ans = new int[size];
        Arrays.fill(ans, -1);

        for (int i = size - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                ans[i] = s.peek();
            }
            s.push(i);
        }
        return ans;
    }

    static int[] pse(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int size = heights.length;
        int[] ans = new int[size];
        Arrays.fill(ans, -1);

        for (int i = 0; i < size; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                ans[i] = s.peek();
            }
            s.push(i);
        }
        return ans;
    }

    static int largestRectangleArea(int[] heights) {
        int[] leftLimits = pse(heights);
        int[] rightLimits = rle(heights);
        int size = heights.length;
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int left = leftLimits[i];
            int right = rightLimits[i];
            if (left == -1)
                left = -1;
            if (right == -1)
                right = size;
            int width = right - left - 1;
            int height = heights[i];
            maxArea = Math.max(maxArea, width * height);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 5, 6, 2, 3 };
        System.out.println(largestRectangleArea(nums));
    }
}
