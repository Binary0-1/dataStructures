import java.util.Arrays;

public class lc217 {

    public static boolean validAnagram(String a, String b) {

        int[] freq = new int[26];
        for (char c : a.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : b.toCharArray()) {
            freq[c - 'a']--;
        }

        return Arrays.stream(freq).allMatch(i -> i == 0);

    }

    public static void main(String[] args) {

        String s = "anagram";

        String b = "nagaram";

        System.out.println(validAnagram(s, b));

    }

}
