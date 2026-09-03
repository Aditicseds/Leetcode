class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        int maxGain = 0;
        int prevZero = 0;
        int j = 0;
        while (j < s.length()) {
            if (s.charAt(j) == '0') {
                prevZero++;
                j++;
                continue;
            }
            while (j < s.length() && s.charAt(j) == '1') {
                ones++;
                j++;
            }
            int nextZero = 0;
            while (j < s.length() && s.charAt(j) == '0') {
                nextZero++;
                j++;
            }
            if (prevZero > 0 && nextZero > 0) {
                maxGain = Math.max(maxGain, prevZero + nextZero);
            }

            prevZero = nextZero;
        }

        return ones + maxGain;
    }
}