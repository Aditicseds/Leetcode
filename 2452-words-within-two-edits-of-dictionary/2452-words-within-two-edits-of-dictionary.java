class Solution {
    boolean Check(String s1, String s2){
        int d=0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                d++;
            }
        }

        if(d<=2)return true;
        return false;

    }
    public List<String> twoEditWords(String[] q, String[] d) {
        List<String> l = new ArrayList<>();
        for(int i=0;i<q.length;i++){
            for(int j=0;j<d.length;j++){
                if(Check(q[i],d[j])){
                    l.add(q[i]);
                    break;
                }
            }
        }
        return l;
    }
}