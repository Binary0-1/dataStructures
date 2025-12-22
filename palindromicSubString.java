class Solution {

    public int Expand(int l, int r, String s){
        int count = 0;
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }

    public int countSubstrings(String s) {
        int countA = 0;
        int countB = 0;
        for(int i = 0 ; i<s.length();i++){
            countA += Expand(i,i,s);
            countB += Expand(i,i+1,s);
        }
        return countA + countB;
    }
}