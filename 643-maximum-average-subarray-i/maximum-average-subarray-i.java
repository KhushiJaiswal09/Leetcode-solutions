class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double ans=0;

        for(int i=0; i<k; i++){
            ans=ans+nums[i];
        }
        double max=ans;
        for(int i=0; i<nums.length -k; i++){
            ans=ans-nums[i]+nums[i+k];

            max=Math.max(max, ans);
        }

         double result=max/k;

         return result;
    }
}