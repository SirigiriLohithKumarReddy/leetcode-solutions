class Solution {
    public List<Integer> majorityElement(int[] nums) {
       ArrayList<Integer> ar = new ArrayList<>();
       //HashMap<Integer,Integer> map = new HashMap<>();
int count = 0;
       for(int i = 0;i<nums.length;i++){
        count = 0;
        if(!ar.contains(nums[i])){
       for(int j = 0;j<nums.length;j++){
        if(nums[i] == nums[j]){
            count++;
        }
        if(count>(nums.length/3)){
            ar.add(nums[i]);
            break;
        }
       }
        }
    }
    return ar;
}
}