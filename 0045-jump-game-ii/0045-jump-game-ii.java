class Solution {
    public int jump(int[] nums) {
    int jumps = 0;
    int end = 0;
    int coverage = 0;
    for(int i =0;i<nums.length-1;i++){
        if(i+nums[i] >coverage){
            coverage = i+nums[i];
        }
        if(i == end){
            jumps++;
            end = coverage;
        }
    }
    return jumps;
    }
}