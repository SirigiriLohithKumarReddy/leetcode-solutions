import java.util.*;
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int l =1;
        int r = x/2;
        int mx=1;
     while(l<=r){
       int mid = l +(r-l)/2;
       long sq=(long) mid*mid;
       if(sq<=x){
        mx=mid;
        l=mid+1;
       }
       else{
        r=mid-1;
       }
     }
     return (int)mx;   
    }
}