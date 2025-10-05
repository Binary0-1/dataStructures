
import java.util.Arrays;
import java.util.List;

public class hourGlassSum {

    public static int hourglassSum(List<List<Integer>> arr) {
        if (arr.size() < 3 || arr.get(0).size() < 3) {
            return 0;
        }
        System.out.println(arr.toString());
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                maxSum = Math.max(maxSum,
                        arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
                                + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2));
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 1, 0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 0, 2, 4, 4, 0),
                Arrays.asList(0, 0, 0, 2, 0, 0),
                Arrays.asList(0, 0, 1, 2, 4, 0));

        int result = hourglassSum(arr);
        System.out.println(result);

    }

}
