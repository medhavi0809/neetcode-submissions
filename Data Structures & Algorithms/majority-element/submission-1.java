class Solution {
    public int majorityElement(int[] nums) {
        
        int fast=0,slow=0;
        for(int i=0;i<nums.length;i++){
            if(fast==0){
                slow=nums[i];
                fast++;
            }
            if(slow==nums[i]){
                fast++;
            }
            else {fast--;
            }
        }
        return slow;
    }
}