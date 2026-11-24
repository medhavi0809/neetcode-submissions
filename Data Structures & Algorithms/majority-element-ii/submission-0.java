class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> itr:map.entrySet()){
            if(itr.getValue()>(nums.length/3)){
l.add(itr.getKey());
            }
        }
        return l;
    }
}