class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
       for(int i =0;i<s.length();i++){
            //st.push(s.charAt(i));
            if(s.charAt(i) == '#'){

            //st.pop();
            if(!st.isEmpty())
            st.pop();}
            else
            st.push(s.charAt(i));
 
        }
    Stack<Character> a = new Stack<>();
    for(int i =0;i<t.length();i++){
          //  a.push(t.charAt(i));
            if(t.charAt(i) == '#'){
                if(!a.isEmpty())
            a.pop();
            //a.pop();
            }
            else
            a.push(t.charAt(i));
 
    }
    boolean b = false;
    s = "";
    t = "";
        while(!st.isEmpty()){
            s = s+st.pop();
        }
         while(!a.isEmpty()){
            t = t+a.pop();
        }
        if(s.equals(t))
        return true;
        else
        return false;
        
    }
}