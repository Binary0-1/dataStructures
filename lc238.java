
import java.util.Arrays;


public class lc238 {

    // public static int divide(int dividend, int divisor) {
    // if (divisor == 0)
    // throw new ArithmeticException("Divide by zero");
    // if (dividend == Integer.MIN_VALUE && divisor == -1)
    // return Integer.MAX_VALUE; // overflow

    // long a = Math.abs((long) dividend);
    // long b = Math.abs((long) divisor);
    // int result = 0;

    // for (int i = 31; i >= 0; i--) {
    // if ((a >> i) >= b) { // if (b << i) fits in a
    // a -= (b << i); // subtract that chunk
    // result += (1 << i); // add the bit to quotient
    // }
    // }

    // return ((dividend < 0) ^ (divisor < 0)) ? -result : result;
    // }

    public static int[] productExceptSelf(int[] nums) {

        int prefix = 1;
        int[] result = new int[nums.length];

        for (int idx = 0; idx < nums.length; idx++) {
            result[idx] = prefix;
            prefix *= nums[idx];
        }

        int suffix = 1;
        for (int idx = nums.length - 1; idx >= 0; idx--) {
            result[idx] *= suffix;
            suffix *= nums[idx];
        }

        return result;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }

}
