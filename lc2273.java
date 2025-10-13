
import java.util.ArrayList;
import java.util.List;

class Lc2273 {

    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }
        int[] chararr = new int[28];

        char[] ar = a.toCharArray(); 

        for (int i = 0; i < ar.length; i++) {
            chararr[ar[i] - 'a']++;
        }

        
        char[] charabrr = b.toCharArray();
        

        for (int i = 0; i < b.length(); i++) {
            chararr[charabrr[i] - 'a']--;
        }

        for (int i = 0; i < chararr.length; i++) {
            if (chararr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> l1 = new ArrayList<>();

        int index1 = 0;

        for (int i = 1; i < words.length; i++) {
            if (isAnagram(words[index1], words[i])) {
                words[i] = "0";
            }else{
                index1 = i;
            }
        }

        for (String word : words) {
            if (!word.equals("0")) {
                l1.add(word);
            }
        }

        return l1;

    }

    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e" };
        System.out.println(removeAnagrams(arr));
    }
}