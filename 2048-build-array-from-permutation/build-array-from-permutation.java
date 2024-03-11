class Solution {
    public int[] buildArray(int[] nums) {
        int i=0;
        int[] ans=new int[nums.length];
        for(i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];

        }
        nums = ans;
        return nums;
    }
}