
import java.util.Arrays;

class lc2300 {
    public int binarySearch(int[] sortedPotions, long success, int multiplier){
        int left = 0;
        int right = sortedPotions.length-1;
        int mid = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;

        if ((long)sortedPotions[mid] * multiplier < success){
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return left;

    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];

        Arrays.sort(potions);

        System.out.println(Arrays.toString(potions));

        for(int i = 0; i<spells.length; i++){
            int firstSuccessfulIndex = binarySearch(potions,success, spells[i]);
            result[i] = potions.length - (firstSuccessfulIndex) ;
        }

        return result;
    }
}