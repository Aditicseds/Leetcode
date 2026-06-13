class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
      for(int i=0; i<words.length;i++)  {
        int sum=0;
        for(char c: words[i].toCharArray()){
           sum+=weights[c-'a'];
        }
        sum=sum%26;
        sb.append((char)(122-sum));
      }
      return sb.toString();
    }
}