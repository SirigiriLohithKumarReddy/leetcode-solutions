class Solution {
    public int smallestNumber(int n, int t) {
      
while(true){
    int p = 1;
    int digit = 1;
    int a = n;
      while(a>0){
digit = a%10;
p = p*digit;
a = a/10;
      } 
      if(p%t == 0) 
      return n;
      else 
      n++;
      }
    }
}