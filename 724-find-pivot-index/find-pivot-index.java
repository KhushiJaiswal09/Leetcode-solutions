class Solution {
    public int pivotIndex(int[] nums) {

        int total_sum = 0, left_sum = 0;

        for(int i=0; i<nums.length; i++){
            total_sum = total_sum + nums[i];
        }

        for(int j=0; j<nums.length; j++){

            left_sum=left_sum + nums[j];

            if(total_sum!=left_sum){
                total_sum=total_sum-nums[j];
            }
            else{
                return j;
            }
            
        }


        return -1;
    }
}