class Solution {
    public boolean find132pattern(int[] nums) {
        int s = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i =nums.length-1;i>=0;i--){
            if(nums[i]<s)
            return true;
            else{
                while(!stack.isEmpty()&& nums[i]> stack.peek()){
                    s = stack.pop();
                }
                stack.push(nums[i]);
            }
        }
        return false;
    }
}