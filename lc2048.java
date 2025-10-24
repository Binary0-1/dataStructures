class lc2048 {

    public boolean checkBalanced(int n) {
        int[] count = new int[10];
        String s = String.valueOf(n);

        for (char c : s.toCharArray()) {

            if (c - '0' == 0) {
                return false;
            }
            count[c - '0']++;
        }


        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (count[digit] != digit) {
                return false;
            }
        }
        return true;

    }

    public int nextBeautifulNumber(int n) {

        int candidate = n+1;

        while(true){
            if(checkBalanced(candidate)){
                return candidate;
            }
            candidate++;
        }

    }
}