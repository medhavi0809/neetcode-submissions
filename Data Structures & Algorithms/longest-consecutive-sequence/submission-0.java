class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> n=new HashSet<>();
for(int i:nums){
    n.add(i);
}
int maxLength=0;
for(int no:nums){
if(!n.contains(no-1)){
int length=1;
int current=no;
while(n.contains(current+1)){
    current++;
    length++;
}
maxLength=Math.max(length,maxLength);
    }}
    return maxLength;
    }
}
