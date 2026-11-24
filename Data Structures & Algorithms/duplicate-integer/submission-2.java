class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
    for(int i:nums){
        m.put(i,m.getOrDefault(i,0)+1);
 }
 for(int count:m.values()){
    if(count>1)
    return true;
 }
 return false;
    }
}