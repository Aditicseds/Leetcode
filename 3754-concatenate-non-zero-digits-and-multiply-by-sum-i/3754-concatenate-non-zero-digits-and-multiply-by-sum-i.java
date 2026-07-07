class Solution {
    public long sumAndMultiply(int n) {
        int m = n;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(m > 0){
            int d = m % 10;
            if(d!=0){
                sum+=d;
                sb.append(d);
            }
            m/=10;

       }
       String s = sb.reverse().toString();
       if(s.equals(""))return 0;
       return sum*Long.parseLong(s);
    }
}