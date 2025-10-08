import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc271 {

    public static String encode(List<String> strs) {
        // write your code here
        String result = "";
        for (String s : strs) {
            result += s.length() + "$" + s + "$";
        }
        return result;
    }

    /*
     * @param str: A string
     * 
     * @return: decodes a single string to a list of strings
     */
    public static List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '$') {
            j++;
        }
            int length = Integer.parseInt(str.substring(i, j));
            j++;
            String word = str.substring(j, j + length);
            result.add(word);
            i = j + length + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> s = new ArrayList<>(Arrays.asList("lint", "code", "love", "you"));
        System.out.println(decode(encode(s)).toString());
    }

}
