class Solution {
    public int findPeakElement(int[] nums) {
     int max=0;
for(int i=0; i<nums.length-1; i++){
    if(nums[i]<nums[i+1]){
        max= i+1;
    }
}

     return max;   

    }
}