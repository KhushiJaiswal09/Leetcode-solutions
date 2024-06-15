class Solution {
    public int[] applyOperations(int[] nums) {
       int count=0;
      

       for(int i=0; i< nums.length-1; i++){
        
        if(nums[i]>0){
            if(nums[i] == nums[i + 1]){
            nums[i]=nums[i]*2;
            nums[i+1]=0;
            count++;
           }
          
        }
       } 
      for(int j=0; j< nums.length-1; j++){
        for(int i=0; i< nums.length-1; i++){
if(nums[i]==0){
    nums[i]=nums[i+1];
    nums[i+1]=0;

}
      }}
      
         

       return nums;
    }
}