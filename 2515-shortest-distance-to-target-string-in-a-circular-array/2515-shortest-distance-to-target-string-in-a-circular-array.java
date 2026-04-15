class Solution {
    public int closestTarget(String[] words, String target, int I) {
        int temp=Integer.MAX_VALUE,n=words.length;
        int i=I,j=I;
        if(words[I].equals(target))return 0;
        for(int count=0;count<words.length;count++){
            if(words[i].equals(target)){
                temp=Math.min((i - I + n) % n,temp);
            }
            i=(i+1)%n;
        
            if(words[j].equals(target)){
                temp=Math.min((I - j + n) % n,temp);
            }
            j=(j-1+n)%n;
        }

        if(temp==Integer.MAX_VALUE)return -1;
        return temp;
    }
}