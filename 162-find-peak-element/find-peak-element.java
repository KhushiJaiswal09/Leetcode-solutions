class Solution {
    public int findPeakElement(int[] nums) {
        int ans=0;
        int ans_index=0;

        if(nums.length==2 && nums[0]<nums[1]){
            return 1;
        }

        for(int i=1; i<nums.length-1; i++){
            if(nums[i] < nums[i+1] && i+1==nums.length-1){ 
                 ans= i+1;                
            }
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1]){ 
                 ans= i;                
            }
        }
        return ans;
    }
}
