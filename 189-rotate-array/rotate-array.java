class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;     
        
        k=(k>n)?k%n:k;
        
    
        swap(nums, 0, n-1);
        swap(nums, 0, k-1);
        swap(nums, k, n-1);
   
    }

    static void swap(int[] nums, int num1, int num2){
        while(num1<num2){
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
        num1++;
        num2--;
        }
    }
}