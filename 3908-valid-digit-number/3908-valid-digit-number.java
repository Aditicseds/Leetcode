class Solution {
    public boolean validDigit(int n, int x) {
        String a = Integer.toString(n);
        for(int i=1;i<a.length();i++){
            if(a.charAt(0)==Character.forDigit(x, 10)) return false;
            if(a.charAt(i)==Character.forDigit(x, 10)) return true;
        }
        return false;
    }
}