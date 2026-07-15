class Solution {
    public int secondsBetweenTimes(String s, String e) {
        int ts1 = Integer.parseInt(s.substring(0,2)) * 60 * 60;
        ts1 += Integer.parseInt(s.substring(3,5)) * 60;
        ts1 += Integer.parseInt(s.substring(6));

        int ts2 = Integer.parseInt(e.substring(0,2)) * 60 * 60;
        ts2 += Integer.parseInt(e.substring(3,5)) * 60;
        ts2 += Integer.parseInt(e.substring(6));

        return ts2-ts1;
    }
}