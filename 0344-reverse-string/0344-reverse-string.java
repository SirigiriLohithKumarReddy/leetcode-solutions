class Solution {
    public void reverseString(char[] s) {
        int mid = (0+s.length)/2;
      reverse(s ,0, s.length-1);
    }
    public static void reverse(char[] s,int left,int right ){
             if(left>right)
             return ;
        char temp = s[left];
        s[left] =  s[right];
        s[right] = temp;
        reverse(s,left+1,right-1);
    }
}