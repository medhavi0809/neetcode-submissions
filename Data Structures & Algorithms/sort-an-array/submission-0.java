class Solution {
    public int[] sortArray(int[] nums) {
    return mergeSort(0,nums,nums.length-1);
    }
    private int[] mergeSort(int start, int[] nums,int end){
      if (start == end) {
            return new int[]{ nums[start] };
        }
            int mid=(start+end)/2;
           int left[]= mergeSort(start,nums,mid);
            int right[]=mergeSort(mid+1,nums,end);
           return merge(left,right);
        
    }
    private int[] merge(int[] left,int[] right){
int l=left.length, r=right.length;
int i=0,j=0,k=0;
int[] merged=new int[l+r];
while(i<l&&j<r){
    if(left[i]<=right[j]){
        merged[k++]=left[i++];
    }
    else{
        merged[k++]=right[j++];
    }

}
while(i<l){
    merged[k++]=left[i++];
}
while(j<r){
    merged[k++]=right[j++];
}
    return merged;       
    }
}