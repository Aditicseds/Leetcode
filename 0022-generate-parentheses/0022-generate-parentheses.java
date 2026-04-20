class Solution {
    List<String> l=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    boolean isValid(String s){
        Stack<Character> stack =new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push('(');
            }
            else{ 
                if(stack.isEmpty()) return false; 
                stack.pop();
            }    
        }
        return stack.size()==0;
    }
    void generate(StringBuilder sb,int n){
        if(sb.length()==2*n){
         if(isValid(sb.toString())){
            l.add(sb.toString());
         }
          return;
        } 
         sb.append("(");
         generate(sb,n);
         sb.deleteCharAt(sb.length()-1);
         sb.append(")");
         generate(sb,n);
         sb.deleteCharAt(sb.length() - 1);
        
    }
    public List<String> generateParenthesis(int n) {
        generate(sb,n);
        return l;
    }
}