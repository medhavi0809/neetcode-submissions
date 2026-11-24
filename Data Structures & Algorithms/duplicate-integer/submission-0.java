class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans=false;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for(int i:nums){
            if(freq.get(i)>1){
                ans=true;
            }
        }
        return ans;
        }
    }
