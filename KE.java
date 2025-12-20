public class KE {

    static boolean checkIfPossible(int[] piles, int k, int h) {
        long hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += (piles[i] + k - 1) / k;
            if (hours > h) return false;
        }
        return hours <= h;
    }

    static int minEatingSpeed(int[] piles, int h) {

        int maxVal = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > maxVal) {
                maxVal = piles[i];
            }
        }

        int left = 1;
        int right = maxVal;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (checkIfPossible(piles, mid, h)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("mid : " + mid + " left: " + left + " right:" + right);
        return left;
    }

    public static void main(String[] args) {
        int[] arr = { 30, 11, 23, 4, 20 };
        int hours = 5;
        System.out.println(minEatingSpeed(arr, hours));
    }
}
