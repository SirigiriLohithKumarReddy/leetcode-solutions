import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
      Stack <Integer> st = new Stack<>();
      for(int i=0;i<operations.length;i++){
        if(operations[i].equals("C")){
            st.pop();
        }
        else if(operations[i].equals("D")){
            st.push(st.peek()*2);
        }
        else if(operations[i].equals("+")){
           // int a = st.peek() ;
           int b= st.pop();
            int c = st.pop();
            st.push(c);
            st.push(b);
            st.push(b+c);
        }
        else{
            st.push(Integer.parseInt(operations[i]));
        }
      }
      int sum = 0;
      while(!st.isEmpty()){
        sum = sum+st.pop();
      }
    return sum;
    }
}