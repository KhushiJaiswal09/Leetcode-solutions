class Solution {
    public int search(int[] nums, int target) {

    int e=nums.length -1;
    int s=0;
        for( int i=0; s<=e; i++ ){
         
          int m=s + (e-s)/2;
       
        if(target > nums[m] ){
            s=m+1;
        }
        else if(target == nums[m]){
            return m;
        }
        else{
            e=m-1;
        }
     
        }
        return -1;
    }
    }
