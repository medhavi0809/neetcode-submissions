class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int curr=0,diff,res=0;
        for(int i:nums){
            curr+=i;
            diff=curr-k;
            res += map.getOrDefault(diff, 0);
map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;
    }
}