class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(ans.containsKey(diff)){
                return new int[]{ans.get(diff),i};}
                else{
                    ans.put(nums[i],i);
                }
            }
            return new int[]{};
        }
    }

