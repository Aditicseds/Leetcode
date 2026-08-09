class Solution {
    public int[] validSequence(String word1, String word2) {
      int match[]  = new int [word1.length()];
      int j=word2.length()-1;
      char[] w1=word1.toCharArray();
      char[] w2=word2.toCharArray();
      int cnt=0;
      for(int i=word1.length()-1;i>=0;i--){
          if(j>=0 && w1[i]==w2[j]){
            cnt++;
            j--;
          }
            match[i]=cnt;
      }
      int i=0;
      j=0;
      int seq[]=new int[word2.length()];
      int k=0;
      boolean changed=false;
      while(i<word1.length() && j<word2.length()){
        if(w1[i]==w2[j]){
            seq[k++]=i;
            j++;

        }
        else if(changed==false && i+1<word1.length() && match[i+1]>=word2.length()-j-1){
            seq[k++]=i;
            j++;
            changed=true;
        }
        i++;
      }
      return j==word2.length()? seq:new int[]{};
    }
}