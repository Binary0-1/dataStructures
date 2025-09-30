
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lc2221 {

    public static int triangularSum(int[] nums) {

        List<Integer> l1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int pass = nums.length - 1;

        while (pass > 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < l1.size()-1; i++) {
                temp.add((l1.get(i) + l1.get(i + 1)) % 10);
            }
            l1 = temp;
            pass--;
        }
        return l1.get(0);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(triangularSum(arr));
    }

}
