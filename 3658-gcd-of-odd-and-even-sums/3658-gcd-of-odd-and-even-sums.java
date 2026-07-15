class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0,eve=0;
     for(int i=1;i<=2*n;i++)   {
         if(i%2!=0) odd+=i;
         else eve+=i;
     }
     int a=eve,b=odd;
     while(b!=0){
        int t=a%b;
        a=b;
        b=t;
     }
     return a;
    }
}