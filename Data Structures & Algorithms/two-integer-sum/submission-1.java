class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            int j=i+1;
            while(j<nums.length){
                if(diff==nums[j])
                return new int[]{i,j};
                else
                j++;
            }
        }
        return new int[]{};
    }
}
