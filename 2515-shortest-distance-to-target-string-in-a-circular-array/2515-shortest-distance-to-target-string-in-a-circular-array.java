class Solution {
    public int closestTarget(String[] words, String target, int I) {
        int temp=Integer.MAX_VALUE,n=words.length;
        int count=0;
        if(words[I].equals(target))return 0;
        for(int i=I;count<words.length;i=(i+1)%words.length){
            if(words[i].equals(target)){
                temp=Math.min((i - I + n) % n,temp);
            }
            count++;
        }
        for(int i=I;count>0;i=(i-1+words.length)%words.length){
            if(words[i].equals(target)){
                temp=Math.min((I - i + n) % n,temp);
            }
            count--;
        }

        if(temp==Integer.MAX_VALUE)return -1;
        return temp;
    }
}