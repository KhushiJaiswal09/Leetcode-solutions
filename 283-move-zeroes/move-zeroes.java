class Solution {
    public void moveZeroes(int[] nums) {
        
        int count=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();

        for( int i=0; i<nums.length; i++){

            if(nums[i]==0){
                count++;
            }else{
                arr.add(nums[i]);
            }
        }
         for( int i=0; i<nums.length-count; i++){
            nums[i]=arr.get(i);
         }
          for( int i=nums.length-count; i<nums.length; i++){
            nums[i]=0;
    }

  //  return nums;
}}