public class LC240 {

    static boolean searchMatrix(int[][] matrix, int target) {

        int left = 0;
        int right = matrix.length - 1;

        while (left < matrix[0].length && right >= 0) {
            int candidate = matrix[right][left];
            if (candidate == target) {
                return true;
            }
            if (target < candidate) {
                right--;
            } else {
                left++;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1 } };
        System.out.println(searchMatrix(arr, 2));
    }

}
