
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class lc347 {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
        }

        List<List<Integer>> bucket = new ArrayList<>(nums.length);

        for (int i = 0; i <= nums.length; i++) {
            bucket.add(null);
        }

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (bucket.get(value) == null) {
                ArrayList<Integer> temp = new ArrayList<>(nums.length);
                bucket.set(value, temp);
            }
            bucket.get(value).add(key);
        }

        int[] result = new int[k];
        int idx = 0;
        for (int i = bucket.size() - 1; i >= 0 && idx < k; i--) {
            if (bucket.get(i) != null) {
                for (int num : bucket.get(i)) {
                    result[idx++] = num;
                    if (idx == k) {
                        break;
                    }
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 2, 3, 1, 3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

}
