class Solution {
    public String removeDuplicates(String s) {
      Stack<Character> st = new Stack<>();
      Stack<Character> q = new Stack<>();
      st.push(s.charAt(0));
      for(int i=1;i<s.length();i++){
        if(!st.isEmpty()&&(st.peek() == s.charAt(i))){
            st.pop();
        }
        else
        st.push(s.charAt(i));
        
      }
      while(!st.isEmpty()){
        q.push(st.pop());
      }
      String s2 = "";
      while(!q.isEmpty()){
        s2 = s2+q.pop();
      }
      return s2;  
    }
}