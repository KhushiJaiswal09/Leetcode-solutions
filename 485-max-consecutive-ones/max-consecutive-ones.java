class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        int result=0;

        for(int i=0; i<nums.length; i++){
            
            if(nums[i]==1){
                count++;
            }
        
            result=Math.max(result, count);    

            if(nums[i]==0 ){
                count=0;           
            }   
        }
        return result;
    }
}